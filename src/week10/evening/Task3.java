package week10.evening;

import java.util.ArrayList;

public class Task3 {

    /*
    Task 3 :

Create a method that get two arrays as a parameters then return the numbers(ArrayList) which has contains unique
elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6
     */

    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {4, 5, 6};

        ArrayList<Integer> result = getUniqueElements(first, second);
        System.out.println(result);

    }

    public static ArrayList<Integer> getUniqueElements(int[] first, int[] second) {
        //I need to create one empty array list
        ArrayList<Integer> result = new ArrayList<>();

        //first I need to det first array elements
        for (int eachNumber : first) {

            //I need to check my arraylist if my arraylist is not containing my element or not
            if (result.contains(eachNumber))
                continue;
            //if not I will put my element inside arraylist
            result.add(eachNumber);
        }
        //second I need to det second array elements
        for (int eachNumber : second) {

            //I need to check my arraylist if my arraylist is not containing my element or not
            if (result.contains(eachNumber))
                 continue;
                //if not I will put my element inside arraylist
                result.add(eachNumber);
        }
        return result;

    }


}
