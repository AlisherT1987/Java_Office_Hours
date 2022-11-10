package week07.evening;

public class TestGasTank {

    public static void main(String[] args) {
        GasTank gasTank = new GasTank();
        gasTank.setInfo(20, 100);
        System.out.println(gasTank);
        System.out.println("=============");
        System.out.println("add 20 gallon");
        gasTank.addGas(20);
        System.out.println(gasTank);
        System.out.println("=============");
        System.out.println("use 10 gallon");
        gasTank.useGas(10);
        System.out.println(gasTank);
        System.out.println("=============");
        System.out.println("add 100 gallon");
        gasTank.addGas(100);
        System.out.println(gasTank);
        System.out.println("=============");


    }
}
