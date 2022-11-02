package week06.morning;

public class Task05 {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str){
        String result = "";
        // coding logic
        if(str.length()==1){
            result = str;
        }else{   // add together  char(end) + between characters + char(begining)
            result = str.charAt(str.length()-1) + str.substring(1,str.length()-1)+ str.charAt(0);
        }
        // substring (beginIndex, endIndex)  does not take endIndex

     return result;
    }


}
