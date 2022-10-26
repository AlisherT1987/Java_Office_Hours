package week05.morning;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
        Write a Java program to read a string and return true if "good" appears starting at index 0 or 1 in the given string.
        g o o d h u s b a n d
        0 1 2 3
         */

        // we want user input from console: we need Scanner object

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new String");
        // assign user input to correct variable datatype
        String str = scanner.nextLine();

        // check if the given string less than 4 characters
        //System.out.println(str.length()); --- how many chars
        // check if string from index 0-3 is equal to "good": true

        if(str.length()<4){
            System.out.println(false);
        }else if(str.substring(0,4).equals("good")){
            System.out.println(true);
        }else if(str.substring(1,5).equals("good")){
            System.out.println(true);
        }else{
            System.out.println("The word is not valid!");
        }



    }
}
