/*Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `" "` (empty string).
Example 1:
The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
"java"}
Example 2:
The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
"mars"}*/

package com.stackroute;

import java.util.HashMap;

public class MapSwap {

    /**
     * This method takes a hashmap and changes the value of keys
     * @param input
     * @return
     */
    public HashMap<String,String> swap(HashMap<String,String> input) {

        //the values are modified
        String value1 = (String) input.get("val1");
        String value2 = (String) input.get("val2");

        if (!value1.isEmpty()) {
            value2 = value1;
            value1 = " ";
        }
        input.put("val1", value1);
        input.put("val2", value2);

        //returns the modified Map
        return input;
    }
}
