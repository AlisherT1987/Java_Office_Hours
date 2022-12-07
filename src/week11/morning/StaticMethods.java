package week11.morning;

public class StaticMethods {


    public static void main(String[] args) {

        System.out.println("Character.isDigit('10') = " + Character.isDigit('A'));
        // isDigit is static method
    }

    public static void displaysMessage(String str){
        System.out.println("Message is : "+str);
    }

    public void instanceMethod(int number){
        System.out.println("number = " + number);
    }

}
