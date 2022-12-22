package week13.evening;

public class TestTXMaxx {
    public static void main(String[] args) {
        Item item=new Item("Pencil",1,3,2.5);
        Item item1=new Item("Pen",2,3,3.5);
        OnSaleItem onSaleItem=new OnSaleItem("Jacket",3,4,100,20);

        TJMaxx tjMaxx=new TJMaxx();
        tjMaxx.addItem(item);
        tjMaxx.addItem(item1);
        tjMaxx.addOnSaleTem(onSaleItem);
        System.out.println(tjMaxx.getRegularItems());
        System.out.println(tjMaxx.getOnSaleItems());
    }
}
