package week05.evening;

public class Task02 {

    public static void main(String[] args) {
        /*
        Task02:
Write a Java program to check whether the first two characters present at the end of a given string.
The given strings is: educated
The first two characters appear in the last is: true
         */
        String str="educated";


        //we need to get first two chars
        String firstPart=""+str.charAt(0)+str.charAt(1); //str.substring(0,2);


        //we need to get the last two chars

                              // before last char       //last char
        String lastPart=""+str.charAt(str.length()-2)+str.charAt(str.length()-1); //str.substring(str.length()-2);


        //we need to compare results
        if (firstPart.equals(lastPart)) {

            //if it is equal print tree
            System.out.println(true);
        }
        //else print false
        else {
            System.out.println(false);
        }





    }
}
