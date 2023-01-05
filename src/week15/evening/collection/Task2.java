package week15.evening.collection;

import java.util.*;

public class Task2 {
    /*

  --    create a list put the names
         ahmet
         rafet
         mehmet
         saffet
         temel
     -- create a method and return the sorted list
      ahmet ,mehmet,rafet,saffet,temel
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("ahmet", "rafet", "temel", "mehmet", "saffet"));
        System.out.println("unsorted names : "+ names);
        List<String> sorted = sortedList(names);
        System.out.println("sorted names: "+sorted);

    }

    private static List<String> sortedList(List<String> names) {
        Set<String> sorted=new TreeSet<>(names);

     return    new ArrayList<String>(sorted);

    }


}
