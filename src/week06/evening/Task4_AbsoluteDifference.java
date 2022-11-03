package week06.evening;

public class Task4_AbsoluteDifference {
/*
Task 4:  Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)

    method  parameter : no , or what kibd of data type --- interger
    method return type : void? --- integer


             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4

 */


    public static void main(String[] args) {
        int result = diff21(23);
        System.out.println("result = " + result);

    }

    public static int diff21(int number) {

        //I need to check the number is smaller than 21
        if (number < 21)
            //I will do 21 - number
            return (21 - number);
        else
            // if not I will do 21 - number and then multiply with 2
            return (number - 21) * 2;


    }
}
