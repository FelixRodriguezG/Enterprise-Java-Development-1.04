package org.example;

import java.util.Arrays;

public class Utils {
    //task2
    /*Write a Java method that finds the smallest and second smallest elements of a
    given array and prints them to the console.
     */

    public Utils() {
    }

    public void findTwoSmallestNumbers(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int smallest = sortedArray[0];
        int secondSmallest = sortedArray[1];
        System.out.println("    - The smallest number is: " + smallest);
        System.out.println("    - The second smallest number is: " + secondSmallest);
    }
    // Task 3


}
