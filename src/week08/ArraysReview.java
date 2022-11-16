package week08;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {
        String city = "Ankara";
        String[] cities = {"Istanbul","New York", "Washington","Chicago"}; // [] --- it is an array, before [] it represents our data type

        int[] numbers = new int[3]; // the size of the integer array is fixed to 3
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 6;
      //   numbers[3] = 7; // Exception out of bound

        // size of array : length no paranthesis
        System.out.println(numbers.length);

        System.out.println(cities[0].length());
        // length  and length() are different

        String[] students = new String[5];
        System.out.println(Arrays.toString(students));

        // looping through arrays: last element of an array is length-1
        for (int i = 0; i <= cities.length-1 ; i++) {
           // cities[i] = "Brooklyn";
            System.out.println("cities = " + cities[i]);
        }

        for (String each : cities) {
            System.out.println("each = " + each);
        }
       // System.out.println(Arrays.toString(cities));

        for (String student : students) {  // shortcut "iter"

        }
    }
}
