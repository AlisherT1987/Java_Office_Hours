package week09.morning;

import java.util.ArrayList;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();  // declare
        // use add() method to store each element
        colors.add("Red");  // one by one : EKLE turkish
        colors.add("Yellow");
        colors.add("Green");
        colors.addAll(Arrays.asList("White","Black","Purple","Blue")); // bulk adding

        System.out.println(colors);

        // colors.size() : how many elements in the list
        // how do we get an element of Arraylist : get() : if you can speak English you know JAVA
        // two options for iteration: index, for each
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for(String each: colors){
            System.out.println(each);
        }


        // Wrapper Class review **********************************
     //    ArrayList<int> list = new ArrayList<int>(); no primitives
        // to store integer we need wrapper class

        Integer num1 = Integer.valueOf(3);
        Integer num2 = Integer.valueOf("3");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(3); // how can I store this number directly: autoboxing, turn primitive 3 to wrapper type integer

        int num3 = list.get(1);  // unboxing : taking a wrapper class integer and assigning to primitive type
        System.out.println(num3); // 3

        num2 = Integer.valueOf("234"); // this is not string anymore or Double.valueOf these methods are common for use

       num1 = 1 + num2;
        System.out.println("num1 = " + num1);

        String result = "some more words 16120 results"; // which method I can use to get only numbers

        String[] resultArr = result.split(" ");
        System.out.println("resultArr[3] = " + resultArr[3]);
        
        Integer searchResultAsNumbers = Integer.valueOf(resultArr[3]);
        System.out.println("searchResultAsNumbers = " + searchResultAsNumbers);


        
    }
}
