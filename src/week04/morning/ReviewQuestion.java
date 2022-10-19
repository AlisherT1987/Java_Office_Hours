package week04.morning;

public class ReviewQuestion {
    public static void main(String[] args) {
        // What is the difference between & (Logical And) and && (Bitwise Logical And)?

        // logical AND checks both sides of the operand
        // bitwise logical AND does not check second operand, if the first one is false

        int a , b;

        a = 5;
        b = 6;

        if( a>b && ++a==b ){          //  false Bitwise Logical AND true
            System.out.println("inside if statement");
        }else{
            System.out.println("inside else statement");
        }

        System.out.println("a = " + a); // a = 5 has NOT been incremented


    }
}
