package week13.evening;


public class Item {
    /*
    In this assignment you will practice:
inheritance
constructors and calling parent class constructor
overriding
list with custom classes

Please follow the instructions on top of each method.

Work on this flow:
Item > OnSaleItem > TJMaxx
     */

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * This cons for initializing fields
     * @param name
     * @param catalogNumber
     * @param quantity
     * @param price
     */
    public Item(String name, int catalogNumber, int quantity, double price) {
        setName(name);
        this.catalogNumber = catalogNumber;
        this.quantity = quantity;
        setPrice(price);
    }

    /**
     *
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

/**
     * setter for private price
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for price
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * getter for name
     * @return
     */
    public String getName() {
        return name;
    }

/**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", catalogNumber=" + catalogNumber +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
