package week13.tasks;


import java.util.ArrayList;

public class TJMaxx {
    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */

    private ArrayList<Item> items;    // we has-A relationship between TJMaxx class and Item class
    private ArrayList<OnSaleItem> onSaleItems;
    private Item singleItem;


    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        items = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */

    public void addItem(Item item){
        this.items.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addItemOnSale(OnSaleItem item){
        this.onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public ArrayList<Item> getItems() {
        return items;
    }
/**
     * getter for onSaleItems
     * @return
     */
    public ArrayList<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }
/**
     * return count of regularItem object
     * @return
     */

    public int getCountItems(){
    return items.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int getCountOnSaleItems(){
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */

    public ArrayList<String> getAllItemNames(){
        ArrayList<String> names = new ArrayList<>();
        items.addAll(onSaleItems);
        for (Item item : items) {
            names.add(item.getName());
        }
        return names;
    }


    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */

    public double getPriceOfItem(int catalogNumber){
        for (Item item : items) {
            if(item.getCatalogNumber()==catalogNumber){
                return item.getPrice();
            }
        }
        for (Item item : onSaleItems) {  // each onsaleitem is an Item as well, because of inheritance
            if(item.getCatalogNumber()==catalogNumber){
                return item.getPrice();
            }
        }
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */


    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */


    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */

}
