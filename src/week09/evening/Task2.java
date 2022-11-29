package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    /*
    2.Write a method that accepts an array and print the difference between the largest and
    smallest values in the array.
    int[] x = {10,3,5,6} = > 7
    int[] y = {7,2,10,9} = > 8
    int[] z = {2,10,7,2} = > 8
     */
    public static void main(String[] args) {


        int[] x = {10, 3, 5, 6};


        int result = findDifferenceBetweenMaxAndMinInArray(x);
        int result2 = findDifferenceBetweenMaxAndMinInArray2(x);

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

    }

    private static int findDifferenceBetweenMaxAndMinInArray2(int[] array) {
        //10,3,5,6
        Arrays.sort(array); // it will sort your array from small to big number

        // 3,5,6,10
        int min = array[0];
                         //last index
        int max = array[array.length - 1];

        return max - min;


    }

    public static int findDifferenceBetweenMaxAndMinInArray(int[] array) {

        //if we want to find difference between maximum number and minumum number

        //first we need to find the maximum number
        int max = findMaxNumberInArray(array);


        int min = findMinNumberInArray(array);

        return max - min;

    }

    private static int findMinNumberInArray(int[] array) {
        //{10, 3, 5, 6,12,14};
        int min = array[0];
        for (int each : array) {
            if (each < min) { // if the conditon is true it means that my element is minumum number
                min = each;
            }
        }
        return min;

    }

    private static int findMaxNumberInArray(int[] array) {
        // int max=Integer.MIN_VALUE; //array[0]; //-2147483648
        int max = array[0];
        //{10, 3, 5, 6,12,14};
        for (int each : array) {

            if (each > max) { // we need to make sure that at least one time it should be true then I am assigning
                // max=Integer.MIN_VALUE
                max = each;
            }

        }

        return max;

    }
}
