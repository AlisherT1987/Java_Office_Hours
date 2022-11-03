package week06.evening;

public class MethodIntro {

    public static void main(String[] args) {
        //printHello

        printHello();
        printHello();
        //print hello with name
        printHello("Adam");
        printHello("Fatih");
        sayHelloFromTo("Adam","Marhabo");


    }

    public static void printHello() {

        System.out.println("Hello");
    }
                                 //arguments
    public static void printHello(String name){
        System.out.println("Hello "+name);
    }

    public static void sayHelloFromTo(String from ,String to){

        System.out.println("Hello " +from +" to " +to );

    }


}
