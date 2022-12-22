package week13.evening;


public class OnSaleItem extends Item{

    // inherits from Item Class
    /**
     * private instance variable, used for discount percentage
     */
private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public OnSaleItem(String name, int catalogNumber, int quantity, double price, int discount) {
                                                  //we need to calculate new price after discount
        super(name, catalogNumber, quantity, price-price*discount/100);
        setDiscount(discount);
    }
/**
     * getter for discount
     * @return
     */
    public double getDiscount() {
        return discount;
    }
/**
     * setter for discount
     * @param discount
     */
    public void setDiscount(double discount) {
        if (discount<0){
            this.discount=0;
        }else {
            this.discount = discount;
        }
    }
/**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    @Override
    public String toString() {
        return "OnSaleItem{discount="+discount+"%, name="+super.getName()+", price="+super.getPrice()+"}";
    }
}
