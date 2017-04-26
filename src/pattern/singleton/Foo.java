package pattern.singleton;

/**
 * Created by Harish on 4/25/2017.
 */
//lazy loaded singleton
public class Foo {
    private static Foo INSTANCE = null;
    //private constructor
    private Foo() {
        if(INSTANCE != null) {
            throw new IllegalStateException("Already Instantiated");
        }
    }

    public static Foo getInstance() {
        if(INSTANCE == null)
            INSTANCE = new Foo();

        return INSTANCE;
    }
}
