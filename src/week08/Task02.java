package week08;

import java.util.Arrays;

public class Task02 {
      /*
    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                 dish washer
        Solution Logic:
        1.  turn the string into String[]   : split method ","
        2. check which elements are more than one word: contains method " "
        3. Store result into a new string
        4. turn your string into an array
     */
      public static void main(String[] args) {
          String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer" ;
          System.out.println(Arrays.toString(findMultipleWords(str)));
      }

      public static String[] findMultipleWords(String unmodifiedStr){
          String[] arr; // will hold result: multiple words elements
          String modifiedStr = "";  // this variable will hold only multiple words elements as a String
          String[] unmodifiedStrArray = unmodifiedStr.split(",");  // we need this line to turn our input string into an array
        //  System.out.println(Arrays.toString(unmodifiedStrArray));
          for (int i = 0; i < unmodifiedStrArray.length; i++) {
              if(unmodifiedStrArray[i].trim().contains(" ")){  // we are triming because taking out spaces before and after, however with contains method I am checking space in between words to see if they are multiple
                  modifiedStr+=unmodifiedStrArray[i]+"/";  // I am storing the result into a String first and for the task purpose would be enough
              }
             // System.out.println("modifiedStr = " + modifiedStr);
          }
          arr = modifiedStr.split("/"); // to turn our result into an array

          return arr;
      }
}
