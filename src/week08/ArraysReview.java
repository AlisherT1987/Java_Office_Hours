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
        // cities = {"Istanbul","New York", "Washington","Chicago"};
        String[] countries = {"US","TR","GER","RUS"}; // data type is String

        String[][] groupsOfData = { // String[]  data type is 1 dimensional String array
                cities, // 1 dimensional String array
                countries, // 1 dimensional String array
        };

        String[][][] moreGroupsOfData = { // data type is 2D  String[][] array
                groupsOfData
        };
        // task is to reach each element of groupsOfData
        for (String[] eachGroupsOfData : groupsOfData) {
            for (String datum : eachGroupsOfData) {
                System.out.println("datum = " + datum);
            }
        }

        // Browser Objects
        Browser browser1 = new Browser();
        browser1.name = "Chrome";
        Browser browser2 = new Browser();
        browser2.name = "Safari";
        Browser browser3 = new Browser();
        browser3.name = "Firefox";
        
        Browser[] browsers = {browser1,browser2,browser3};
        for (Browser browser : browsers) {
            System.out.println("browser.name = " + browser.name);
        }

    }
}
