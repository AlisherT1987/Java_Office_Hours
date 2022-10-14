package week03.morning;

public class Task02 {
    public static void main(String[] args) {

        /*
        Task 2:
Write a Java program that reads an integer between 0 and up to 1000 and adds all the digits in the integer.
565 = I want to get digits 5 (hundreds) --  6 (tens)  -- - 5 (ones)
Hint : using modules and division operators
         */

        System.out.println("25/10 = " + 25/10);  // 2
        System.out.println("25%10 = " + 25%10);   // 5

        int number = 565;  // declare and assign value
        int digit1s, digit10s, digit100s;
        int remainingNumber ;

        digit1s = number % 10;               // get the last number by using modulus operator with number 10
        remainingNumber = number / 10;       // how to get rid of digit(right to left) that we have found before

        System.out.println("digit1s = " + digit1s);      // 5
        System.out.println("remainingNumber = " + remainingNumber); // 56

        digit10s = remainingNumber % 10;  // get the last number by using modulus operator with number 10
      //  remainingNumber = remainingNumber /10;
        remainingNumber /= 10;     // shorthand operators
        System.out.println("digit10s = " + digit10s);
        System.out.println("remainingNumber = " + remainingNumber);

        digit100s = remainingNumber % 10;
        System.out.println("digit100s = " + digit100s);

        int sum = digit1s + digit10s + digit100s;
        System.out.println("sum = " + sum);
    }
}
