package week04.evening;

public class T5_Animal {



    /*
    Task 5:

Create  a program that accepts animal as String

							DOG 	- domestic animal
							CAT 	- domestic animal
							TIGER 	- wild  animal

							For other animal - unknown animal

							INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal
     */

    public static void main(String[] args) {

        String animal = "cat";

        switch (animal) { //java is case sensetive language
                          //in switch we are looking exact matching
            case "DOG":
            case "CAT":
                System.out.println(animal + " is domestic animal");
                break;
            case "TIGER":
                System.out.println(animal + " is a wild animal");
                break;
            default:
                System.out.println(animal + "is not known");
                break;

        }


    }
}
