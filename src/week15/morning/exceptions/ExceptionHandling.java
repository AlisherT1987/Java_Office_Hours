package week15.morning.exceptions;

public class ExceptionHandling {
    /*
    Exception: are objects.
    Handling means: We take care of this exception so that following codes are executed
    How do we handle? : try-catch blocks
    All runtime exceptions are unchecked exceptions

     */
    public static void main(String[] args) {

      //  throw new ArithmeticException(); // I created exception object with new keyword
        try {
            System.out.println(5 / 0); // java.lang.ArithmeticException
        }catch (Exception e){
            e.printStackTrace();
        }
        // No matter what happens at previous lines you want below code to execute
        System.out.println("Some other important steps of your automation code");

    }

}
