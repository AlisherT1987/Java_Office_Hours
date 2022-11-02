package week06.morning;

public class Task08 {
    public static void main(String[] args) {

        System.out.println(firstIndexOfWord("Python compared to Java is Easier","java"));
        System.out.println(firstIndexOfWord("Python compared to Java is Easier","c#"));

    }

    public static int firstIndexOfWord(String sentence, String word){
        int result = -1;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        // logic of code
        if(sentence.contains(word)){
            result = sentence.indexOf(word);
        }

        return result;
    }


}
