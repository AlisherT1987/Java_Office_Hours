package week13.tasks;

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
     * public constructor with:
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */
    public Item(String name, int catalogNumber, int quantity, double price) {
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.quantity = quantity;
        this.price = price;
    }

/**
     * setter for name instance variable
     * @param name
     */




    /**
     * setter for private price
     * @param price
     */



    /**
     * getter for price
     * @return
     */




    /**
     * getter for name
     * @return
     */






    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */


}
