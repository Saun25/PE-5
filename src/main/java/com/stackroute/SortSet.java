/*Write a program to implement set interface which sorts the given randomly ordered names in

ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive*/

package com.stackroute;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {

    /**
     * This method takes a Set and then sorts it,the sorted set is then stored in a ArrayList and returned
     * @param input
     * @return
     */
    public ArrayList<String> sort(Set<String> input){
        TreeSet<String> set= new TreeSet<>(input);
        ArrayList<String> array = new ArrayList<>(set);
        return array;
    }
}
