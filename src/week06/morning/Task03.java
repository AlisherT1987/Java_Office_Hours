package week06.morning;

public class Task03 {
    public static void main(String[] args) {
        System.out.println(trimSpacesOfString("   Java    is a lovely            coding            language"));
    }

    public static String trimSpacesOfString (String str){
        String result="";   // result is a container that holds output of my code logic
        // logic part
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if(c ==' '){
                continue;  // if char is empty do NOT go below this line
            }
            result += c ;
        }
        return result;
    }
}
