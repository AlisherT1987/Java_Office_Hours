package week06.qaTime;

public class Loop1 {
    public static void main(String[] args) {

        /*
         unique characters

         "aaccbbcd"
         String unique  = ""

        for( beginning ; condition  ; iteration) {  // for loop continues until condition becomes false
        statement

        we need three elements to be able create any loops
beginning
condition
iteration
         */

        String str = "aaccbbcdeeeegggg"; // the length can be changed

        for( int i = 0;  i < str.length() ;   i++  ){
            System.out.println(str.charAt(i));
        }
    //    System.out.println("i = " + i);   compiler error  i is for loop scope -- local variable

        System.out.println("-------------different for loop-------");
        boolean condition = true;
        int j = 0;  // declared outside of loop, global variable

        for(        ; condition  ;     ){
            System.out.println(str.charAt(j));  //
            j++;  // increment
            if(j == str.length()-1){
                condition = false;
            }
        }
        System.out.println("j = " + j);



        boolean whileCondition = true;
        int z = 0;

        while (whileCondition){
            System.out.println(str.charAt(z));
            z++;
            if(z==str.length()-1){
               // break;
                whileCondition = false;
            }
        }





    }
}
