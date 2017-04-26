package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Harish on 4/26/2017.
 */
public class FailSafeTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put("1", "firstName");
        hashMap.put("2", "lastName");
        hashMap.put("3", "middleName");

        Iterator<String> itr = hashMap.keySet().iterator();
        while(itr.hasNext()) {
            System.out.println(hashMap.get(itr.next()));
            hashMap.put("4", "phoneNumber");
        }

    }
}
