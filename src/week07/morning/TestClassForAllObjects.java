package week07.morning;

public class TestClassForAllObjects {
    public static void main(String[] args) {

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
        item3.setInfo("couch","dark blue",1);
        System.out.println(item3);

    }
}
