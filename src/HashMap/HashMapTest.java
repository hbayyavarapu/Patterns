package HashMap;

import java.util.*;

/**
 * Created by Harish on 4/25/2017.
 */

/**
 * This example shows the difference between a HashMap & LinkedHashMap
 */
class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> movieMap = new HashMap<>();
        Map<String, Integer> linkedStudentMap = new LinkedHashMap<String, Integer>();

        movieMap.put("Harish", 10);
        movieMap.put("Kumar", 90);
        movieMap.put("Bayyavarapu", 60);
        System.out.println("HashMap");
        //Lambda function to iterate over the keys & print them
        movieMap.forEach((k,v) -> System.out.println( k + ": " + v));

        System.out.println("Iterate using enumeration");
        Enumeration<String> stringEnumeration = Collections.enumeration(movieMap.keySet());
        while(stringEnumeration.hasMoreElements()) {
            System.out.println(stringEnumeration.nextElement());
        }

        linkedStudentMap.put("Harish", 90);
        linkedStudentMap.put("Kumar", 10);
        linkedStudentMap.put("Bayyavarapu", 60);

        System.out.println("LinkedHashMap: ");
        linkedStudentMap.forEach((k,v) -> System.out.println(k + ": " + v));
        System.out.println();
    }

}
