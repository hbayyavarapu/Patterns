package generics;

/**
 * T is type(String, Integer)
 *
 * Created by Harish on 4/25/2017.
 */
public class Box<T> {
    private T t;

    public void setObject(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setObject("hello");
        boxString.inspect(10);

    }
}
