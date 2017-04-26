package garbagecollection;

/**
 * Created by Harish on 4/25/2017.
 */
public class GCTest {
    public static void main(String[] rags) {
        int g1[] = {1, 4,2, 9, 10};
        System.out.println(g1[1]);

        Runtime.getRuntime().gc();
        System.out.println("ready for garbage collections");
    }
}
