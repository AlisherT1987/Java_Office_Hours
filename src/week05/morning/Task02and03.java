package week05.morning;

import java.util.Scanner;

public class Task02and03 {
    public static void main(String[] args) {
        /*
        Write a Java program to check whether the first two characters present at the end of a given string.
The given strings is: educated
The first two characters appear in the last is: true
         */

        boolean result;

        // get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word with more than two chars");
        String str = scanner.nextLine();

        // check if word has more than two chars
        // str.substring(0,2) : gives first two chars
        // for strings last character is found with str.length-1
        /*
        g o o d g u y       : str.length=7
        0 1 2 3 4 5 6       : last index = str.length-1
          */

        scanner.close();

        if(str.length()<2){
            result = false;
        }else if(str.substring(0,2).equals(str.substring(str.length()-2))){
            result = true;
        }else{
            result = false;
        }
        System.out.println("result = " + result);


        // Task03: if Task02 result is true take out first two characters

        if(result){
            str = str.substring(2);
        }

        System.out.println("str = " + str);





    }
}
