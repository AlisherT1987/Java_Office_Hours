package week05;

public class Q_A_time {
    public static void main(String[] args) {

        // Why do we use .equals() for strings?
        /*
        JAVA is OOP lang.
        Everything depends on objects: We need objects to call for methods to use in JAVA

         */

        String str1 = "Java"; // I created java string object in literal way: The object is created in String Pool

        String str2 = "Java";  // oscar , onder, I have twin, ozgur

        System.out.println(str1 == str2); // true, this is checking if both reference (names) are pointing to same object

        String str3 = new String("Java"); // in the Heap memory we have created a new object

        System.out.println(str1 == str3); // false, this time the references are pointing to different objects

        // they have created .equals method to check if the values are same, even though objects are different

        System.out.println(str3.equals(str1)); // true

        /*
        Until now you have only seen primitive data types: int, char, boolean, double.....
        we can use  == sign to check equality
        with strings you got into object world
         */


        String s = new String("5");

        System.out.println(s+5); // 55  not 10   String+Number = String (virus)

        System.out.println(1+10+s);  // 11 + s not 16  0 115

        System.out.println(1+10+s+1+10); // 115(string) = 115110

        String result = 1+10+s+1+10;

        System.out.println("result = " + result);

        System.out.println(1+10+s+(1+10)); // precedence (1+10+s+11) -- 11511

        System.out.println(1+10+s+1*10); // 11510

        /*
        substring
        indexOf("string") -----> integer
        charAT

Custom Methods:
no-return type methods: it is doing the action and not returning anything
return type methods: the method does action and returns you some value so we can use it in next action

         */


     //   Q_A_Time2.createEmail("Anna","Vakina");
    }







}
