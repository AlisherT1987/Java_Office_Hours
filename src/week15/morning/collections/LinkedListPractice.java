package week15.morning.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {

        /*
        LinkList has both List methods and Queue methods are implemented
         */

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(list); //[10, 200, 300, 40, 90]
        System.out.println(list.get(1));//calling get() from linkedList obj==> 200


        System.out.println(((LinkedList) list).poll());// calling poll() FIFO ==>10
        System.out.println(list); //[200, 300, 40, 90]
        System.out.println(((LinkedList) list).pop());
        System.out.println(list);




    }
}
