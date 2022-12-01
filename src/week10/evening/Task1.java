package week10.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    /*

Task 1 :

Create a method that which is get array list as a parameter then return the numbers which are divisible by 3.

input:

  numbers : 2,3,4,5,6,8,9

output:

3,6,9

     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(2,3,4,5,6,8,9));

     ArrayList<Integer> result=   findNumbersDivisibleBy3(numbers);


    }


    public static ArrayList<Integer> findNumbersDivisibleBy3(ArrayList<Integer> numbers) {

        ArrayList<Integer> result=new ArrayList<>();

         //we need to look at the number one by one
        //"iter" for  foreach
        for (Integer each : numbers) {

            //we need to check the number if the number is divisible by 3
            if (each%3==0)

            //if yes put put the number inside the result arraylist
               result.add(each);
        }

        //return result

        return result;


    }


}
