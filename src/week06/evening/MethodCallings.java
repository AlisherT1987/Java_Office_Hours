package week06.evening;

public class MethodCallings {

    public static void main(String[] args) {
        callAFromMain();
    }

    public static void callAFromMain() {
        callBFromA();
        /*
         System.out.println("B"); we can assume that code is in here
         */
        System.out.println("A");
    }

    public static void callBFromA() {
        System.out.println("B");

    }
}
