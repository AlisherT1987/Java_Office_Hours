package week06.evening;

public class PrintEvenOrNot {
    /*
   Write a method that can check if a number is even or not


     */
    public static void main(String[] args) {
        printEvenOrNot(20);
        printEvenOrNot(25);
    }

    public static void printEvenOrNot(int number) {
      //implement the logic
      if (number%2==0){ //this number is even
          System.out.println(number + " is even");
      }else {
          System.out.println(number + " is not even");
      }


    }

}
