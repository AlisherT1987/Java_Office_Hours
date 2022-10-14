package week03.morning;

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
        int firstInt = 25;
        int secondInt = 5;
        int sum, difference, product, max, min;
        double average;
       // int averageInt;

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
      //  average = (double)(firstInt+secondInt)/2;   ---- kind of optional
      // (double)(firstInt+secondInt) ---> explicit casting is done by coder(person)
     //   System.out.println("average = " + average);
    //   averageInt =(int)average; // bigger data type is trying to fit into smaller data type, mandatory explicit casting

        /*
        Conditional Statements: if - else --- work with boolean results
        if( condition) {true: do this } else {do something else}
        condition should produce boolean result
        Relational Operators: > , < , == , !=, >=, <=
         */

        boolean isMaxFirstInteger = firstInt > secondInt ;
        System.out.println("isMaxFirstInteger = " + isMaxFirstInteger);

        if(isMaxFirstInteger) {
            max = firstInt;
            min = secondInt;
        }else {
            max = secondInt;
            min = firstInt;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        // CTRL + Z , CMND+Z ---> undo  , to double a line CTRL+D, CMND + D

    }
}
