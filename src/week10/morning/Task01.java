package week10.morning;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
     /*
    Task 1 :
Create a method that which is get arraylist as a parameter then return the numbers which are divisible by 3.
input:
  numbers : 2,3,4,5,6,8,9
output:
3,6,9
            number%3==0  --- it is divisible by three
     */
     public static void main(String[] args) {
         ArrayList<Integer> listOfNumbers = new ArrayList<>();
         listOfNumbers.addAll(Arrays.asList(2,3,4,5,6,8,9));
         System.out.println("divisibleByThree(listOfNumbers) = " + divisibleByThree(listOfNumbers));
     }

//   public static ArrayList<Integer> divisibleByThree(ArrayList<Integer> numbers){
//       numbers.removeIf(eachNumber -> eachNumber%3!=0); // eachNumber%3!=0 : checking if number is not divisible then removes the number from the list
//       return numbers;
//   }

    public static ArrayList<Integer> divisibleByThree(ArrayList<Integer> numbers){
         ArrayList<Integer> newList = new ArrayList<>();
//        for(Integer each: numbers){  // ConcurrentModificationException
//            if(each % 3 != 0){
//                numbers.remove(each);
//            }
//        }
        // numbers.removeIf(eachNumber -> eachNumber%3!=0); lambda operator

        for(Integer each: numbers){
            if(each % 3 == 0){
                newList.add(each);
            }
        }
     return newList;
    }
}
