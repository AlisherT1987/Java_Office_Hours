package week17.morning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondApproach {
    // You have an automated system that checks your code input: then how would you solve this problem?
    public static void main(String[] args) {

        // The first line contains an integer, (the initial number of elements in ).
        Scanner sc = new Scanner(System.in); // created to get user input

        List<Integer> list = new ArrayList<>(); // created my list in a polymorphic way
        int numberOfElements = sc.nextInt();
        /*
        oh but we have a bug... they enter 5 for number of elements but then thru the string you can enter as many as you want .
         */
        sc.nextLine();
        String listOfNumbers = sc.nextLine(); // I got numbers as a single line

        String[] numbersStringArray = listOfNumbers.split(" ");
        for (String s : numbersStringArray) {
            list.add(Integer.valueOf(s));
        }

        int numberOfQueries = sc.nextInt();
        String result = "";

        for (int i = 0; i < numberOfQueries; i++) {
            sc.nextLine(); // this one will pick the enter action from previous sc.nextInt() call

            String action = sc.nextLine(); // this will take action word
            int index = sc.nextInt(); // the index of the element that the action will perform
            switch (action){
                case "Insert":
                    list.add(index,sc.nextInt()); // new number
                    break;
                case "Delete":
                    list.remove(index);
                    break;
                default:
                    System.out.println("Wrong Input");
                    break; // not necessary but I like it that way
            }


        }

        for (Integer number : list) {
            result+= number+" ";
        }
        System.out.println(result);

        sc.close();




    }
}
