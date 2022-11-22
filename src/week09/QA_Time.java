package week09;

import java.util.Arrays;

public class QA_Time {
    /*
    Use a nested loop to print the following output:
        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
Loops : iterate
        2 chars    Capital---- same + smallCase a-z
     */

    public static void main(String[] args) {

        char beginningChar = 'a';
        String result = "";

        System.out.println(beginningChar);  // a
        System.out.println((char)(beginningChar+1)); // b  // one way to iterate with chars is adding number values to it

//        for (int i = 0; i < 26 ; i++) {
//            result = "A"+(char)(beginningChar+i)+" ";
//            System.out.print(result);
//        }
//        System.out.println();
//        for (int i = 0; i < 26 ; i++) {
//            result = "B"+(char)(beginningChar+i)+" ";
//            System.out.print(result);
//        }
//        System.out.println();
//        for (int i = 0; i < 26 ; i++) {
//            result = "C"+(char)(beginningChar+i)+" ";
//            System.out.print(result);
//        }
//        System.out.println();
//        for (int i = 0; i < 26 ; i++) {
//            result = "D"+(char)(beginningChar+i)+" ";
//            System.out.print(result);
//        }
//        System.out.println();
//
//        for (char c = 'A'; c <= 'Z' ; c++) {   // second way of iterating chars
//            for (int i = 0; i < 26 ; i++) {
//                result = ""+c+(char)(beginningChar+i)+" ";  // ""+c : gives us String
//                System.out.print(result);
//            }
//            System.out.print("\n");   // this action is part of our repeated action
//        }

        // loop action: beginning,+iteration+ ending and condition
//        char beginningCharCapital = 'A';  // beginning
//
//        while (beginningCharCapital<='Z'){   // condition
//            for (int i = 0; i < 26 ; i++) {
//                result = ""+beginningCharCapital+(char)(beginningChar+i)+" ";
//                System.out.print(result);
//            }
//            System.out.print("\n");
//            beginningCharCapital++;   // iteration
//        }


        // same action with for each loop: we need to have a char Array
        char[] arr = new char[26];
        char[] arr2 = new char[26];
        String resultWithForEach = "";
        char first = 'a';
        char firstCapital = 'A';
        for (int i=0; i<=25 ; i++) {    // this loop I used for creating our char Array
            arr[i] = (char)(first+i);   // adding elements to an array
            arr2[i] = (char)(firstCapital+i);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
// for each loop works with Data Structures (Arrays, Arraylist.....later on List, Set, Map ....)
        for(char C: arr2){
            for(char c: arr){
                resultWithForEach = ""+C+c+" ";
                System.out.print(resultWithForEach);
            }
            System.out.print("\n");
        }
    }
}
