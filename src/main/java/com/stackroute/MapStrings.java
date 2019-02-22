/*Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/

package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class MapStrings {

    /**
     * This method takes a String array as input and returns a Map having the words as key and a boolean value
     * @param input
     * @return
     */
    public Map<String,Boolean> mapping(String[] input){
        Map<String,Boolean> map = new HashMap<>();
        int a=0;
        int b=0;
        int c=0;
        int d=0;

        //counts the occurence and of words and assigns true if >=2 else returns false
        for (String s : input){

            if(s.contains("a")) {
                a++;

                if (a >= 2) {
                    map.put(s, true);
                }
                else{
                    map.put(s, false);
                }
            }

            else if(s.contains("b")) {
                b++;

                if (b >= 2) {
                    map.put(s, true);
                }
                else{
                    map.put(s, false);
                }
            }

            else if(s.contains("c")) {
                c++;

                if (c >= 2) {
                    map.put(s, true);
                }
                else{
                    map.put(s, false);
                }
            }

            else if(s.contains("d")) {
                d++;

                if (d >= 2) {
                    map.put(s,true);
                }
                else{
                    map.put(s, false);
                }
            }
        }

        //returns the map
        return map;
    }
}
