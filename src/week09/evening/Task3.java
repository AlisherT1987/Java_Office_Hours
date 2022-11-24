package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {


    /*
    3. Write a Java program to create a new array list, add some colors (string) and print out the collection by iterate through all elements in a array list.
     */
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("White", "Red"));

        colors.add("Black");

        colors.addAll(Arrays.asList("Yellow", "Purple"));

        //iter
        for (String color : colors) {
            System.out.println("color = " + color);
        }

//itar
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("colors.get(i) = " + colors.get(i));

        }
        /*

colors.for
        for (String color : colors) {

        }
colors.forr
        for (int i = colors.size() - 1; i >= 0; i--) {

        }
        colors.fori
        for (int i = 0; i < colors.size(); i++) {

        }

         */

    }
}
