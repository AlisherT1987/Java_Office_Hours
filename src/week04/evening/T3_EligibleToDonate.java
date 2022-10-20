package week04.evening;

import java.util.Scanner;

public class T3_EligibleToDonate {

    /*

Task 3:



					        Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"
     */


    public static void main(String[] args) {
        Scanner fatih=new Scanner(System.in); // we can use eny name for getting input
        System.out.println("fatih enter your age");
        int age=fatih.nextInt();
        System.out.println("fatih enter your weight");
        int weight= fatih.nextInt();

String result="";

        //check the age
        if (age>=18) {
            //if it is greater than or equeal 18

            //check the weight
            if (weight>50){
                System.out.println("You are eligible to donate blood");
                result="You are eligible to donate blood";
            }else {
                System.out.println("You are not eligible to donate blood");
                result="You are not eligible to donate blood";
            }

        }else {

            //if not age is smaller tahn 18
            System.out.println("Age must be greater than 18");
            result="Age must be greater than 18";

        }


        System.out.println(result);


    }
}
