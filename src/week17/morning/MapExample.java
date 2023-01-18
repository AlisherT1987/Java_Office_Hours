package week17.morning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    // You are given a phone book that consists of people's names and their phone number.
    // people's names : Keys of a Map
    // phone number : Value of a Map

    public static void main(String[] args) {

        Map<String,Long> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // how many elements in the phone book

        for (int i = 0; i < n; i++) {
            in.nextLine();
           String name = in.nextLine();
           Long number = in.nextLong();
           phoneBook.put(name,number);
        }

        // scanner has a method hasNext() to check for entry
        in.nextLine();

        while (in.hasNext()){
            String searchInput = in.nextLine();
            if(phoneBook.containsKey(searchInput)){
                System.out.println(searchInput+" = "+phoneBook.get(searchInput));
            }else if(searchInput.equals("exit")){
                break;
            }
            else {
                System.out.println("Not Found");
            }
        }

        in.close();

    }

}
