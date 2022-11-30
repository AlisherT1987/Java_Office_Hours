package week10.morning;

import java.util.ArrayList;

public class Task03 {
    /*
Task 3 :
Create a method that get two arrays as a parameters then return the arraylist which has only unique elements in it.
first array :1,2,3,4,5
second array :4,5,6
output:
1,2,3,4,5,6
 */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6};
        System.out.println("mergeUnique(arr1,arr2) = " + mergeUnique(arr1, arr2));

        String[] arrStr1 = {"java","javascript","C++","Selenium","Cucumber"};
        String[] arrStr2 = {"TestNG","Junit","Jenkins","Selenium","Cucumber"};
        System.out.println("mergeUnique(arrStr1,arrStr2) = " + mergeUnique(arrStr1, arrStr2));

        // how about if we have two String arrays: we can create overloaded methods

    }

    public static ArrayList<Integer> mergeUnique(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();
        // How can you check if a list contains an element? result.contains(element): if the element not contained add it to our list
        for (int i : arr1) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        for (int i : arr2) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static ArrayList<String> mergeUnique(String[] arr1, String[] arr2){  // same name different parameters
        ArrayList<String> result = new ArrayList<>();
        // How can you check if a list contains an element? result.contains(element): if the element not contained add it to our list
        for (String i : arr1) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        for (String i : arr2) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
