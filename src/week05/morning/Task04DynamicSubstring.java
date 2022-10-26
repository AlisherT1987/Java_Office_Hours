package week05.morning;

public class Task04DynamicSubstring {
    public static void main(String[] args) {
        String webSearchResult = "result count: 96757512345 ";
        /*
        result count:12345   index of ":" is 12  --- substring(13)

        return type of indexOf method : int
        indexOf method takes as string parameter
         */

        System.out.println("webSearchResult.indexOf(\":\") = " + webSearchResult.indexOf(":"));

        // a useful shorcut to create variables quickly
        int indexofColumn = webSearchResult.indexOf(":");

        String numbersInResult = webSearchResult.substring(indexofColumn+1);

        numbersInResult = numbersInResult.trim(); // takes out white spaces

        System.out.println("numbersInResult = " + numbersInResult);

    }
}
