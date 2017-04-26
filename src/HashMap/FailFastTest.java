package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Harish on 4/26/2017.
 */
public class FailFastTest {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "firstName");
        hashMap.put("2", "lastName");
        hashMap.put("3", "middleName");

        Iterator itr = hashMap.keySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());

            //When i try to modify the hashmap when the iterator is being executed throws ConcurrentModificationException
            //there by gracefully exiting the code
            hashMap.put("4", "phoneNumber");
        }

    }
}
