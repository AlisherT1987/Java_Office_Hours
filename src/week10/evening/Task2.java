package week10.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    /*


Task 2 :

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:

first arraylist :1,2,3

second arraylist :4,5,6

output:

1,2,3,4,5,6

     */

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5, 6));
      /*
      shortcut of creating method
      windows: ALT + ENTER +ENTER
      mac    : OPTION + ENTER + ENTER
       */
        int[] result = mergeArrayLists(first, second);

        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeArrayLists(ArrayList<Integer> first, ArrayList<Integer> second) {
        int[] result = new int[first.size() + second.size()];
        int index = 0;
        //first I need to get the first arraylists elements one by one
        for (Integer each : first) {
            //I need to put inside the array
            result[index++] = each;
        }


       /* result[0]=1;
        result[1]=2;
        result[2]=3;


        */
        System.out.println(index); //3

        //second I need to get the second arraylist elemnets one by one
        for (Integer each : second) {
            //I need to put inside the array
            result[index++] = each;
        }

        //I need to put inside same array

/*
        result[3] = 4;
        result[4] = 5;
        result[5] = 6;



 */
        return result;
    }
}
