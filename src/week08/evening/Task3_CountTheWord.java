package week08.evening;

public class Task3_CountTheWord {

    /*
     Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
     */

    public static void main(String[] args) {

        String [] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        //we need to check all names
        int counter=0;

        for (String name : names) {

            //get the first char
            char firstChar = name.toLowerCase().charAt(0);

          // String first= name.charAt(0)+"";
            //get the last char
            char lastChar = name.toLowerCase().charAt(name.length() - 1);

            // String last= name.charAt(name.length() - 1)+"";

            //if(first.equalIgnoreCase(last))

            if (firstChar==lastChar)
                counter++;




        }
        System.out.println(counter);







    }
}
