package week07.morning;

public class TestClassForAllObjects {
    public static void main(String[] args) {

        // HouseItems Class
        HouseItems item1 = new HouseItems();
        item1.name="chair";
        item1.color="beige";
        item1.amount=4;
        System.out.println("item1.name = " + item1.name); // chair

        HouseItems item2 = new HouseItems();
        System.out.println("item2.name = " + item2.name); // null
        item2.name="table";
        item2.color="brown";
        item2.amount=1;

        HouseItems item3 = new HouseItems();
        item3.setInfo("couch","dark blue",1, 950.50);
        System.out.println(item3);

        // MyCalculator1 Class
        MyCalculator1 calculator1 = new MyCalculator1();
        System.out.println(calculator1.add(5,3));
        System.out.println(calculator1.subtract(5,3));
        System.out.println(calculator1.multiply(5,3));
        System.out.println(calculator1.divide(5,3));

        // MyCalculator2 Class
        MyCalculator2 calculator2 = new MyCalculator2();
        calculator2.setInfo(5,3);
        System.out.println(calculator2.add());
        System.out.println(calculator2.subtract());
        System.out.println(calculator2.multiply());
        System.out.println(calculator2.divide());
        calculator2.setInfo(10,20);
        System.out.println(calculator2.add());//30


    }
}
