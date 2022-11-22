package week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QATime {
    public static void main(String[] args) {

        String str = "java";

        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        chars = reverse(chars);  // [a, v, a, j]

        System.out.println(Arrays.toString(chars));

        str = new String(chars);   // this line is new for you

        System.out.println("str = " + str);

        // Arraylist way

       // System.out.println(reverseString(chars)); // [j, a, v, a]

        String word = "javascript";
        String reversedWord = "";
       // char[] letters = word.toCharArray();
        String[] letters = word.split("");

        ArrayList<String> list = reverseString(letters);
        for (int i = 0; i < list.size(); i++) {
            reversedWord+= list.get(i);
        }
        System.out.println("reversedWord = " + reversedWord);

        // addALL method
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        Integer[] numbers3 = {25,30,35,40};
        numbers1.add(5);
        numbers1.add(10);
        numbers2.add(15);
        numbers2.add(20);

        numbers.addAll(numbers1);
        numbers.addAll(numbers2);
        numbers.addAll(Arrays.asList(numbers3));
        System.out.println(numbers);
    }

    public static char[] reverse(char[] array){

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }

   /*
    PIQ: How many ways you can can create a String?
    - Literal way :  String str = "java" ;
    - With new key word:  String str = new String ("java")  or new String(char array)
    */


    public static ArrayList<String> reverseString(String[] letters){
        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < letters.length; i++) {
//            list.add(letters[i]); // Implicit casting: it is taking our primitive data and casting to Wrapper Class Object (Character)
//        }

        list.addAll(Arrays.asList(letters)); //  Arrays.asList: turns arrays into a list, then addAll method adds the list to our arraylist

        Collections.reverse(list);  // collections utility class is a special lass that has a lot of methods
      //  Collections.swap();
        return list;
    }
}
