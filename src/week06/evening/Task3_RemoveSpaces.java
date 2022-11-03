package week06.evening;

public class Task3_RemoveSpaces {

    /*
    Task 3 :    Write a method that can remove  all extra space from String , trim() is forbidden

// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

    			 Input: "  Hello "
        	     Output: Hello
     */


    public static void main(String[] args) {
        ourTrim("  Hello ");


    }

    private static void ourTrim(String str) {
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
           /* if (ch!=' ')
                result+=ch;

            */

            if (ch==' ')
                continue;
            result+=ch;
        }
        System.out.println("result = " + result);

    }
}
