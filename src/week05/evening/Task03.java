package week05.evening;

public class Task03 {

    public static void main(String[] args) {


        /*
        Task03
Follow up Task02;  if a substring of length two appears at both its beginning and end, return a string without the substring at the beginning otherwise, return the original string unchanged.
The given strings is: educated
The new string is: ucated
         */
                  //0123456789
        String str="educated";

        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            System.out.println(str.substring(2));
        }else {
            System.out.println(str);
        }



    }
}
