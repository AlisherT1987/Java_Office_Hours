package week06.evening;

public class Task1_PrintPrimeOrNot {

    /*
    Task 1 :   Write a method that can check if a number is prime or not

				Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

     */

    public static void main(String[] args) {
        //7

        printNumberPrimeOrNot(-7);


    }

    private static void printNumberPrimeOrNot(int number) {
        boolean isPrime=true;

        // my number is divisble by 2,3,4,5,6,7
        for (int i = 2; i <number ; i++) {

            if (number%i==0){ // we are checking number is divisable by  i values one by one
                isPrime=false;
                break;
            }

        }

       /*
        if (number==2)
            isPrime=true;

        */

        if (number<=1) {
            isPrime = false;
        }

        if (isPrime){
            System.out.println(number + " is Prime number");
        }else {
            System.out.println(number + " is not Prime number");
        }


    }
}
