package week05.morning;

public class QuizQuestions {
    public static void main(String[] args) {

        String str1 = "java";  // created in literal way : String Pool (Heap)
        String str2 = "java";

        String str3 = new String("java");  // with new keyword- we created a new object

        /*

        ==  sign : checks if the objects are same objects
        .equals() method checks if values are same

        */

        System.out.println("str1 == str2 " + (str1 == str2) ); // true
        System.out.println("str3==str1 = " + (str3==str1) );  // false,
        System.out.println("str3.equals(str1) = " + str3.equals(str1));
    }
}
