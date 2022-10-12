package week01.morning;

public class Task01 {
    public static void main(String[] args) {

/*
Declare and Assign value to Variables
DataType variableName = VALUE;
DataType variableName1, variableName2 ;
variableName1 = VALUE;
variableName2 = VALUE;
Write a Java program that accepts two integers and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
 */
        int firstInt = 26;
        int secondInt = 5;
        int sum, difference, product, max, min;
        double average;

        // arithmetic operators
        sum = firstInt + secondInt;
        System.out.println("sum = " + sum);

        difference = firstInt - secondInt;
        // shortcut for printing variables : soutv
        System.out.println("difference = " + difference);

        product = firstInt * secondInt;
        System.out.println("product = " + product);

        average = (firstInt+secondInt)/2;  // datatype ---> double : implicit casting is done by machine/compiler
                System.out.println("average = " + average);
                // we are adding two integers and dividing by a number assign it to double variable: implicit casting
        average = (double)(firstInt+secondInt)/2;
        // (double)(firstInt+secondInt) ---> explicit casting is done by coder(person)
        System.out.println("average = " + average);

    }
}
