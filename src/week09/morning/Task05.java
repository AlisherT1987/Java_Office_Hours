package week09.morning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task05 {
    /*
    (Use Collections Utility Class) Search an element in a array list then sort the given array list. Copy one array list into another.  Reverse elements in a array list.
     */
    public static void main(String[] args) {
        // contains method
        ArrayList<String> colors = new ArrayList<>();  // declare
        // use add() method to store each element
        colors.add("Red");  // one by one : EKLE turkish
        colors.add("Yellow");
        colors.add("Green");
        colors.addAll(Arrays.asList("White","Black","Purple","Blue")); // bulk adding

        if(colors.contains("Red")){
            System.out.println("Element Exists");
        }else{
            System.out.println("No Such Element");
        }

        // sorting Arraylist
        Collections.sort(colors);
        System.out.println("colors = " + colors);

        // copy list
        ArrayList<String> colorsNew = new ArrayList<>();
        colorsNew.addAll(Arrays.asList("","","","","","",""));
        Collections.copy(colorsNew,colors);
        System.out.println("colorsNew = " + colorsNew);

        // reverse a list
        Collections.reverse(colors);
        System.out.println("colors = " + colors);
    }
}
