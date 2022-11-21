package week08.evening;

public class Task4_LongestPalindrom {

    /*
     Task 4 :  For Each - Nested For

            Longest Palindrome

             Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
                    Output: No palindrome
     */

    public static void main(String[] args) {

        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        // we need to get word one by one

        /*
        0123456
        racecar


         */

        String result=getLongestPalindrome(words);
        System.out.println(result);


    }

    private static String getLongestPalindrome(String[] words) {
        String longestPalindrome="";

        for (String eachWord : words) {

            //is palindrome or not  ----> call the method
            boolean isPalindrome = isTheWordPalindrome(eachWord);

            if (isPalindrome&&eachWord.length()>longestPalindrome.length())
                longestPalindrome=eachWord;

        }

     return longestPalindrome;

    }

    private static boolean isTheWordPalindrome(String eachWord) {
        boolean isPalindrome=true;
      eachWord=  eachWord.replace(" ","");
        for (int i = 0; i < eachWord.length() / 2; i++) {
            //"racecar"
            /*
            r a c e c a r
            I will compare
            r with r
            a with a
            c with c

             */
            //I will get one char from beginning
            char ch1 = eachWord.charAt(i);
            //I will get one char from last
            char ch2 = eachWord.charAt(eachWord.length() - i - 1);

            // I will compare one by one
            if (ch1!=ch2){
             return   false;

            }


        }
        return isPalindrome;
    }


}
