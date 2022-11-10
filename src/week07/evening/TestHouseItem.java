package week07.evening;

public class TestHouseItem {

    public static void main(String[] args) {
        //Data Type    reference
        HouseItems item1 = new HouseItems();
        item1.name = "table";
        item1.color = "Red";
        item1.amount = 2;

        System.out.println(item1);


        HouseItems item2 = new HouseItems();

        item2.name = "chair";
        item2.color = "Blue";
        item2.amount = 6;

        System.out.println(item2);

        HouseItems item3=new HouseItems();
        item3.setInfo("iron","purple",2);

        System.out.println("item3 = " + item3);


    }
}
