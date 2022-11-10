package week07.evening;

public class MyCalculator {
    /*

Task-2
version 1: without instance variables and no setInfo method
Create a "MyCalculator" class that has instance methods which can do simple math operations on two numbers. The methods are: plus, minus, multiply and divide.
All the methods get two ints then the method does the required math operation and returns the result as an int.

In version one we just have instance methods with parameters (actions) no attributes of the class

     */


    public int plus(int num1,int num2){

        return (num1+num2);

    }

    public int minus(int num1,int num2){

        return (num1-num2);
    }

    public int multiply(int num1,int num2){
        return (num1*num2);
    }

    public double divide(int num1,int num2){
        if (num2!=0) {
            return ((double) num1 / num2);
        } else {
            System.err.println(num2 + "can not be  0 ");

        }
        return -1;
    }

}
