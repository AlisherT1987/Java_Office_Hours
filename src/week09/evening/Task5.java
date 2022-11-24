package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
/*
5. (Use Collections Utility Class) Search an element in a array list then sort the given array list. Copy one array list into another. Shuffle elements in a array list. Reverse elements in a array list.
 */
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>(Arrays.asList("Mike","Adam","Alvin","Hamid","Tijana"));

        String name="Adam";
        //Search an element in a array list then return the index

        for (int i = 0; i < names.size(); i++) {
            String temp = names.get(i);
            if (temp.equals(name)){
                System.out.println(i);
                break;
            }
        }


    }
}
