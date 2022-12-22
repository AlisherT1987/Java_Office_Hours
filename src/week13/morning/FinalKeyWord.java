package week13.morning;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalKeyWord {

    final int number; // instance variable Mandatory to initialize
    final static double price; // variable Mandatory to initialize
    final int age;

    public FinalKeyWord(int number, int age){
        this.number=number;
        this.age=age;
    }
    static {
        price = 0.0;
    }

    public final void someMethod(){

    }

//    public void setAge(int age){   Can NOT initialize with setter
//        this.age=age;
//    }

}

class Test {  // can not extends FinalKeyWord
//    @Override
//    public void someMethod(){  // Can NOT
//
//    }

    public static void main(String[] args) {
        final int number; // local finals variables initialization is NOT mandatory

       // System.out.println("number = " + number);


        // final Arrays
        final int[] numbers = {4 , 5, 6};
        System.out.println("numbers = " + numbers[0]);
        numbers[0] = 3;
        System.out.println("numbers = " + numbers[0]);

       // numbers = new int[5];  // can NOT reassign to array object reference

        // final ArrayList
        final ArrayList<Integer> moreNumbers = new ArrayList<>(Arrays.asList(4,5,6));
        moreNumbers.add(7);
        System.out.println("moreNumbers = " + moreNumbers);
        moreNumbers.set(0,3);
        System.out.println("moreNumbers = " + moreNumbers);

       // moreNumbers = new ArrayList<>(); // can NOT reassign to array object reference

    }
}