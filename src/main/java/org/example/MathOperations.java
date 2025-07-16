package org.example;

public class MathOperations {
    /**
     * Returns the difference between the largest and smallest values in an array of integers.
     *
     * @param array the array of integers
     * @return the difference between the largest and smallest values
     * @throws IllegalArgumentException if the array is null or empty
     */
    // Task 1
    public static int findDifference(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = array[0];
        int min = array[0];
        for (int num = 0; num < array.length; num++) {
            if (array[num] > max) {
                max = array[num];
            }
            if (array[num] < min) {
                min = array[num];
            }
        }
        return max - min;
    }
    // Task 3
    public static double calculateExpression(double x, double y) {
        return (Math.pow(x, 2) + Math.pow( (((4 * y)/5) - x), 2));
    }
}
