package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class App {
    public static void main(final String[] args ) {
        assertThat("Peano was wrong!", 1, equalTo(2));
    }
}
