package week07.evening;

public class TestMyCalculator {

    public static void main(String[] args) {

        MyCalculator myCalculator=new MyCalculator();

        System.out.println(myCalculator.plus(2, 3));

        System.out.println(myCalculator.multiply(4, 5));



        MyCalculator2 myCalculator2=new MyCalculator2();
        myCalculator2.setInfo(20,5);
        System.out.println(myCalculator2.plus()); //25
        System.out.println(myCalculator2.minus()); // //15


    }
}
