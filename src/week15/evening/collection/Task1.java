package week15.evening.collection;

import java.util.*;

public class Task1 {

/*
 List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));

 - get the unique numbers(one of them) from list
 [24, 1, 2, 3, 9, 4, 5]
 */


    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));

        Set<Integer> set=new HashSet<>(numbers);
        System.out.println(set);

/*
 ArrayList<Integer> list=new ArrayList<>();
//old solution
        for (Integer number : numbers) {
            if (!list.contains(number))
                list.add(number);
        }

 */


    }
}
