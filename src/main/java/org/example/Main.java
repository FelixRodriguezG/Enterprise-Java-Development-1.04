package org.example;

public class Main {
    public static void main(String[] args) {
        /*Write a Java method that returns the difference between the largest and smallest values in an array of
        integers. The length of the array must be at least 1.
        Task 1*/
        int[] numbers = {3, 5, 1, 8, 2};
        System.out.println("Task 1 -> Finding the difference between the largest and smallest values in the array.");

        // Call the method and print the result
        try {
            int difference = MathOperations.findDifference(numbers);
            System.out.println("    - The difference between the largest and smallest values is: " + difference);
        } catch (IllegalArgumentException error) {
            System.err.println("    - Error: "  + error.getMessage());
        }
        /*Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.
        Task 2*/
        // Create an instance of Utils to access the method
        Utils utilities = new Utils();
        // Define an array of integers
        int[] array = {7, 2, 5, 1, 3};
        // Call the method to find and print the two smallest numbers
        try{
            System.out.println("Task 2 -> Finding the two smallest numbers in the array.");
            // Call the method to find and print the two smallest numbers
            utilities.findTwoSmallestNumbers(array);
        } catch (IllegalArgumentException error) {
            System.err.println("    - Error: " + error.getMessage());
        }

        /*Write a Java method that calculates the result of the following mathematical
        expression, where x and y are two variables that have been pre-set in your code*/
        // Task 3
        // Define the variables x and y
        var x = 3.44;
        var y = 4.67;
        // Call the method to calculate the result of the expression
        double result = MathOperations.calculateExpression(x, y);
        System.out.println("Task 3 -> Calculating the result of the mathematical expression.");
        System.out.println("    - The result of the expression is: " + result);



    }
}

