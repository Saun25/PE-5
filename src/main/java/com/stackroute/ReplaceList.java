/*Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []*/

package com.stackroute;

import java.util.ArrayList;

public class ReplaceList {

    /**
     * This method replaces the value of the ArrayList at given indexes
     * @param input
     * @return
     */
    public ArrayList<String> replaceElement(ArrayList<String> input ) {

        //The values are replaced with different values
        input.set(0, "kiwi");
        input.set(2, "mango");

        //returns the modified ArrayList
        return input;
    }

    /**
     * This method checks whether the ArrayList has been emptied
     * @param input
     * @return
     */
    public boolean emptyString(ArrayList<String> input){
        input.clear();

        return input.isEmpty();
    }
}
