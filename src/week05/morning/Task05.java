package week05.morning;

public class Task05 {
    public static void main(String[] args) {

        String originalWord = "Madam";
        String reversedWord = "";
        boolean result;
        // add characters one by one to reversedWord
        // CTRL+D : to duplicate a line
        reversedWord += originalWord.charAt(4);
        reversedWord += originalWord.charAt(3);
        reversedWord += originalWord.charAt(2);
        reversedWord += originalWord.charAt(1);
        reversedWord += originalWord.charAt(0);

        System.out.println("reversedWord = " + reversedWord);

        if(originalWord.equalsIgnoreCase(reversedWord)){   // to make case insensitive
            result = true;
        }else{
            result = false;
        }

        System.out.println("result = " + result);
    }
}
