package collections_framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Project Name    : java-interview-practice
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/27/2022
 * Time            : 11:23 AM
 * Description     :
 **/

public class TestMap {

    public static void main(String[] args) {
        Map<String, String> namesMap = new HashMap<String, String>() {{
            put("Osanda", "QE");
            put("Eranga", "SE");
        }};

        // Using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, String> entry : namesMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        // Using keySet() for iteration over keys
        for (String name : namesMap.keySet())
            System.out.println("key: " + name);
        // Using values() for iteration over values
        for (String url : namesMap.values())
            System.out.println("value: " + url);

        // forEach(action) method to iterate map
        namesMap.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
    }
}
