package week07.qaTime;

import java.util.Scanner;

public class Replit1 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:

        double price=0;
        if(order.equals("burger")){
            price=12.50;

        }else if(order.equals("chicken")){
            price=9.75;
        };
        System.out.println("Your total is $"+price);
    }
}
