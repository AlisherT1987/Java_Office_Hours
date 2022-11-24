package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

    /*
    4. Write a Java program to insert an element into the array list at the first position. Then retrieve an element (at a specified index) from the array list. Then update specific array element by given element. Lastly remove the third element from the array list.
     */
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>(Arrays.asList("Fatih","Mike","Anastasia"));

        //insert an element into the array list at the FIRST position

        names.add(0,"Adam");
        //retrieve an element (at a specified index) from the array list.

        names.get(0); //give me the first element

        names.get(1); // give me the second element

        //update specific array element by given element.

        names.set(3,"Tulay");

        //remove the third element from the array list.

        names.remove(2);









    }
}
