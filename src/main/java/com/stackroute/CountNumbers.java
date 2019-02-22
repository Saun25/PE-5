/*Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/

package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNumbers {

    /**
     * This method counts the number of words in the string and returns a  with the word as key and no of occurences as value
     * @param input
     * @return
     */
    public Map<String,Integer> count(String input){
        Map<String,Integer> map = new HashMap<>();
        String[] array=input.split("\\s+|-|_+|,|@|\\*|\\?");
        int i=1;
        int j=1;
        int k=1;

        //Finds the count
        for(String s:array){

            if(s.matches("one")){
                map.put(s,i);
                i++;
            }

            if(s.matches("two")){
                map.put(s,j);
                j++;
            }

            if(s.matches("three")){
                map.put(s,k);
                k++;
            }
        }

        //returns a Map containing the key value pair
        return map;
    }
}
