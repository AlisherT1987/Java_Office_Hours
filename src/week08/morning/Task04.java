package week08.morning;

public class Task04 {
    /*
    Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
                            Output: No palindrome
        2 Methods
        - first one checks is a statement is palindrome
        - second one checks from a String array, if there are any palindrome statement and returns longest one
     */
    public static void main(String[] args) {
        String[] str = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"}; // Happy path
        System.out.println(findMaxLengthPalindrome(str));
        String[] str2 = {"abc", "dna", "kevin", "joe", "lamp"}; // Negative test
        System.out.println(findMaxLengthPalindrome(str2));
    }
    public static boolean isPalindrome(String str){
        boolean flag = false;
        // we reverse the original statement and compare reversed and original one if they are same or not
        String reversedStr = "";
        if(str.contains(" ")){   // this one takes out any space in the statement
            str = str.replace(" ","");
        }
        str = str.toLowerCase();   // Strings are immutable
        for (int i = str.length()-1 ; i >= 0 ; i--) { // go from last char until to the first one
            reversedStr += str.charAt(i);
        }
        if(reversedStr.equals(str)){ // reversed and original one if they are same or not
            flag = true;
        }
        return flag;
    }

    public static String findMaxLengthPalindrome(String[] arr){
        String result = "No Palindrome";
        String maxLengthPalindrome = "";
        for (int i = 0; i < arr.length; i++) {
            if(isPalindrome(arr[i])){
                if(maxLengthPalindrome.length()<arr[i].length()){
                    maxLengthPalindrome = arr[i];
                }
            }
        }
        if(!maxLengthPalindrome.isEmpty()){
            result = maxLengthPalindrome;
        }
        return result;
    }

}
