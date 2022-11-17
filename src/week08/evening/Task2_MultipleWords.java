package week08.evening;

public class Task2_MultipleWords {

    /*
    Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                 dish washer

     */

    public static void main(String[] args) {

String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

String [] words=str.split(", "); // we need to separate words by using delimeter

        for (String eachWord : words) {
            if (eachWord.contains(" ")) // if my word contains space it means that word is multiple
                System.out.println(eachWord);

        }

    }
}
