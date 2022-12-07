package week11.morning;

public class StaticMethods {

    public static String message = "This is static field";

    public int num = 10; // instance field

    public static void main(String[] args) {

        System.out.println("Character.isDigit('10') = " + Character.isDigit('A'));
        // isDigit is static method
    }

    public static void displaysMessage(String str){
        System.out.println("Message is : "+str);
        System.out.println("message = " + message);
        // System.out.println(num); Error : Static accepts only static
    }

    public void instanceMethod(int number){
        System.out.println("number = " + number);
        System.out.println("message = " + message);
        System.out.println("num = " + num);
    }

}
