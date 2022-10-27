package week05.evening;

public class Task05 {

    public static void main(String[] args) {
        /*
        Task05
Reverse a given String of length 5, and if original and reversed strings are same print true
input: "madam" --------reversed word=madam
output : true
input: "hello"
output: false  --- reversed word= olleh
         */
          //01234
String str="madam";

char FirstFromLast=str.charAt(4); //m
char SecondFromLast=str.charAt(3); //a
char ThirdFromLast=str.charAt(2); //a
char FourthFromLast=str.charAt(1); //a
char FifthFromLast=str.charAt(0); //a

       // String str2=""+10+101+10;

         String reverse=""+FirstFromLast+SecondFromLast+ThirdFromLast+FourthFromLast
                +FifthFromLast;

         if (str.equals(reverse)){
             System.out.println(true);
         }else {
             System.out.println(false);
         }









    }
}
