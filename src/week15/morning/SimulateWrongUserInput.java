package week15.morning;

import java.util.Scanner;

public class SimulateWrongUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age : ");

        try {
            int age = input.nextInt();
            System.out.println("your age is :" + age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("There are some follow up tasks in your code which definitely needs to get executed");

    }
}
