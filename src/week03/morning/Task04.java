package week03.morning;

public class Task04 {
    public static void main(String[] args) {
        /*
        a , b , c  ----- is c = a + b ;  is a = b + c ; is b = a+ c  : if any of these conditions is true then our result should be true , otherwise false
         */

        int a, b, c ;
        a = 5;
        b = 10;
        c = 15;

        boolean result ;

        // is c = a + b
        boolean isCequalAplusB = (c == (a+b));
        System.out.println("isCequalAplusB = " + isCequalAplusB);

        // is a = b + c
        boolean isAequalBplusC = (a == (b+c));
        System.out.println("isAequalBplusC = " + isAequalBplusC);

        // is b = a+ c
        boolean isBequalAplusC = (b == (a+c));
        System.out.println("isBequalAplusC = " + isBequalAplusC);

        result = (isAequalBplusC || isBequalAplusC || isCequalAplusB) ;

        System.out.println("result = " + result);

    }
}
