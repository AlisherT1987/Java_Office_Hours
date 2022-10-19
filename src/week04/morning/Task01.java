package week04.morning;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
     /*
     Write Java Code:
			that, given a positive integer N  However, any number divisible by 2, 3 or 5 should be replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

			- If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
			N % 2 == 0 --- > it is divisible by 2
			Codility  ---> stored in String variables

			15 :  TestCoders
			30 :  CodilityTestCoders
      */

        Scanner scanner = new Scanner(System.in);
        // prompt the user to put integer value
        System.out.println("Please enter a positive integer number: ");
        int userInput = scanner.nextInt(); // scanner object with the help nextInt method picks up the value and that value is used for variable userInput


        // First Way : this is a long solution and does not use concatenation
        //int N1 = 30;  // Hard coded way
        int N1 = userInput;
        String result1 = ""; // empty bucket that will hold whatever comes out of our logic
        if(N1%2 == 0 && N1%3 == 0 && N1%5==0){   // checking if number is divisible by 2,3,5
            result1 += "CodilityTestCoders";
        }else if(N1%2 == 0 && N1%3 == 0){
            result1 += "CodilityTest";
        }else if(N1%3 == 0 && N1%5==0) {
            result1 += "TestCoders";
        }else if(N1%2 == 0 && N1%5==0){
            result1 += "CodilityCoders";
        }else if(N1%2 == 0){
            result1 += "Codility";
        }else if(N1%3 == 0){
            result1 += "Test";
        }else if(N1%5 == 0){
            result1 += "Coders";
        }else {
            result1 +="NotDivisible";
        }

        System.out.println("result1 = " + result1);


        // Second and shorter way using concatenation : Multiple ifs without else
        int N2 = userInput;
        String result2 = "";
     if(N2%2==0 || N2%3==0 || N2%5==0) {   // Nested IF conditions

         if (N2 % 2 == 0) {                  // if conditions are like doors
             result2 += "Codility";
         }
         if (N2 % 3 == 0) {                 // you come to second door, no matter of what the result of first door you check this condition
             result2 += "Test";
         }
         if (N2 % 5 == 0) {
             result2 += "Coders";
         }
     }else{
         result2 = "Error, Not Divisible";
     }

        System.out.println("result2 = " + result2);

    }
}
