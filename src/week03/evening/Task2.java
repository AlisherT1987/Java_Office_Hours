package week03.evening;

public class Task2 {


    public static void main(String[] args) {
        /*
        Task 2:
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
An integer is a number that can be written without a fractional component. For example, 23, 6, 0, and −1245 are integers.
Input Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
         */

        // 15   1+5 =6
        //in order to find last digit in math we need to use modules(%) with 10

       // System.out.println(15 % 10); // 5
       // System.out.println(15 / 10); //1
        //654
        //if we want to get the last digit which is 5 use the % with 10
        System.out.println("last digit: "+654 % 10); //4
        int lastDigit = 654 % 10;
        //how we can get first two digit if we divide with 10 we can get first two digit which is 65
        //65%10 -->5
        System.out.println("second digit: "+654 / 10 % 10); //5
        int secondDigit = 654 / 10 % 10;
        //how we can get the first digit only if we divide with 100 we can easily get the first digit
        System.out.println("first digit: "+654 / 100);//6
        int firstDigit = 654 / 100;

        int sum=firstDigit+secondDigit+lastDigit;
        System.out.println("sum = " + sum);



    }
}
