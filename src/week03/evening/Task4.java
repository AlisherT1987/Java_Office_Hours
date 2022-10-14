package week03.evening;

public class Task4 {

    /*
    Task 4:
Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Input and Output
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true

a , b , c  ----- is c = a + b ;  is a = b + c ; is b = a+ c  : if any of these conditions is true then our result should be true , otherwise false
     */

    public static void main(String[] args) {

        int first = 5; //15 //10
        int second = 10; //5  //15
        int third = 15; //10 //5

        if ((first + second == third) || (first + third == second) || (second + third == first)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        int number = 100;
        //how we can find the 20 percentage of the 100

        double percetegeOfNumber = (double) number * 20 / 100;


    }
}
