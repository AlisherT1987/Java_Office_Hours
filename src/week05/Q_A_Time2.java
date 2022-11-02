package week05;

import java.util.Scanner;

public class Q_A_Time2 {
    public static void main(String[] args) {
        createEmail("oscar","smith");  // just action

        String inputBox1= "";

     //   inputBox = createEmail("oscar","smith");
        // I can not re-use it, my method needs to return string for me

        inputBox1 = createEmail_2("oscar","smith");

        System.out.println("inputBox = " + inputBox1);

        String bankAccount = inputBox1+"account1234";


        String inputBox2 = createEmail_2("Mahliyo","Gafurova");

        /*
        only one variable

        more than variable: Arrays, Arraylist, List
        Data Structures: ["email1","email2","email3"]
         */

        System.out.println("bankAccount = " + bankAccount);

        bankAccount = bankAccount.substring(5,15); // substring is return type method
        System.out.println("bankAccount = " + bankAccount);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence:");// java JaVa Python jaVa python
        String str = input.nextLine();            // java
        System.out.println("Enter the word:"); //java
        String word = input.nextLine();//cout++

        System.out.println(str.length()-word.length()+1);
        int count=0;

        for (int i = 0; i <str.length()-word.length()+1 ; i++) {
            if (str.substring(i,word.length()+i).equalsIgnoreCase(word)){
                count++;

            }
            System.out.println(str.substring(i,word.length()+i));
        }
        System.out.println(count);

        str.contains("a");
    }

     /*
    email account creation method:
    method takes from us:
    firstName
    lastName
    and returns email account name as string:  firstName.lastName@gmail.com
    first with void then without void

    How to solve problem in Java:
    first think solution without thinking about Java Language:
    solution steps--- Pseudo Code

    Think about Java Methods-Tools: Syntax

    to find maximum I need to compare
    from Java I can use  ">" sign and if statements



     */

    public static void createEmail(String firstName, String lastName){
        System.out.println(firstName);
        System.out.println(lastName);
        
        String email = firstName+"."+lastName+"@gmail.com";
        System.out.println("email = " + email);
    }

    public static String createEmail_2(String firstName, String lastName){
       // int x = 5;
        String email = firstName+"."+lastName+"@gmail.com";
        return email;
    }

    public static int max(int num1, int num2) {

        int max;
        if (num1 < num2) {
            System.out.println(num2 + " is Maximum number");
            max=num2;
        } else  {
            System.out.println(num1 + " is Maximum number");
            max = num1;
        }
        return max;
    }

    public static int min(int num1, int num2) {

        int min;
        if (num1 < num2) {
            System.out.println(num1 + " is minimum number");
            min=num1;
        } else  {
            System.out.println(num1 + " is Minimum number");
            min = num2;
        }
        return min;
    }

}
