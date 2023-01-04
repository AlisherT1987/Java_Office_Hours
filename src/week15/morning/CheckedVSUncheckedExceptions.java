package week15.morning;

public class CheckedVSUncheckedExceptions {
    /*
    Checked exceptions need to be handled before compile time
     */

    public static void main(String[] args) {

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // call wait method from another method, with using throws keyword
       // wait(3); // throws InterruptedException

        wait(3); // since it is handled, we don't need to handle again
    }

    public static void wait(int seconds)  {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
