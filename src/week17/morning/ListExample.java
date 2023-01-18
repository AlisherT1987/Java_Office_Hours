package week17.morning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {

        // The first line contains an integer, (the initial number of elements in ).
        Scanner sc = new Scanner(System.in); // created to get user input

        List<Integer> list = new ArrayList<>(); // created my list in a polymorphic way
        // prompt the user for number of elements input
        System.out.println("How many elements do you want to initialize your list with?");
        int numberOfElements = sc.nextInt();

        // loop to get and store numbers inside the list
        for (int i = 0; i < numberOfElements ; i++) {
            System.out.println("Enter your next number");
            list.add(sc.nextInt()); // this line will pick up user entries from console
        }

        // get number of queries from user
        System.out.println("How many queries you wanna do?");
        int numberOfQueries = sc.nextInt();
        String result = "";

        for (int i = 0; i < numberOfQueries; i++) {
            sc.nextLine(); // this one will pick the enter action from previous sc.nextInt() call
            System.out.println("Do you want to Insert a new element or Delete an element to a specific index");
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
