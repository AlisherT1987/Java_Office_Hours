package week04.morning;

public class Task05 {
    public static void main(String[] args) {
        /*
        Create  a program that accepts animal as String

							DOG 	- domestic animal
							CAT 	- domestic animal
							TIGER 	- wild  animal

							For other animal - unknown animal

							INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal



         */

        String input = "BIRD";
        String output = "";

        switch (input){
            case "DOG": case "CAT":  // or statement with switch
                output = "domestic animal";
                break;
            case "TIGER":
                output = "wild animal";
                break;
            default:
                output = "unknown animal";
               // break;
        }

        System.out.println("output = " + output); 
    }
}
