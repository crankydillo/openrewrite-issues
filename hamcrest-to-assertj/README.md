Meant to show an issue with 'AddDependency' when used on modified LST.

```sh
mvn org.openrewrite.maven:rewrite-maven-plugin:5.39.0:run \
    -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-testing-frameworks:2.16.0 \
    -Drewrite.activeRecipes=org.openrewrite.java.testing.hamcrest.MigrateHamcrestToAssertJ \
    -Drewrite.exportDatatables=true
```

After this, I expect `App.java` should be changed and `assertj` dependency
should be added to the pom.  However, only `App.java` is changed and code no
longer compiles.  Debugging suggests a condition related to `onlyIfUsing` in
`AddDependency` is not seeing the modified LST.
