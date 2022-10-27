package week05.evening;

public class Q3If {

    public static void main(String[] args) {
        boolean b=false;

        System.out.println("b = " + b);

        boolean c=true; // c=false
        System.out.println("c = " + c);

        if (b){
            System.out.println("B");
        }else if (c) {
            System.out.println("C");
        }else {
            System.out.println("else block");
        }

    }
}
