package week07.qaTime;

import java.util.Arrays;

public class QATimeTask2 {
    public static void main(String[] args) {
        String[][] items = {   // holding 1 dimensional array objects
                {"Apple", "Banana", "Grape", "Avocado"},  // String objects
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        String[] smallItems =  {"Apple", "Banana", "Grape", "Avocado"};

        String[][] items2 = {   // holding 1 dimensional array objects
                {"Apple2", "Banana2", "Grape", "Avocado"},  // String objects
                {"Paper Towels", "Toilet Papers2", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea2", "Pepsi2", "Water2"},
                smallItems
        };



        String[][][] moreItems = {items,items2}; // can not put here smallItems
        String[][][] moreItems2 = {items,items2}; // can not put here smallItems

        for (int i = 0; i < moreItems.length; i++) {    // looping inside 3 dimen array
            for (int j = 0; j < moreItems[i].length; j++) {    // bring me i (0,1,2) index element of moreItems
                for (int k = 0; k < moreItems[i][j].length; k++) { //  bring me ([0][0] index) which 1 dimensional

                }

            }

        }

        String[][][][] fourDimens = {moreItems,moreItems2};
        /*
        {"Apple", "Banana", "Grape", "Avocado"}  --- at index 0 of items
        {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"} --- at index 1 of items
         */

        int[] arr = {4, 7, 10};   /*
         4 -- index 0
         7 -- index 1
         10 -- index 2
 */
        // how do we print Arrays
        System.out.println(Arrays.deepToString(items));

        for (int i = 0; i < items.length; i++) {
            System.out.println(Arrays.toString(items[i]));
            for (int j = 0; j < items[i].length; j++) {

            }
        }



    }
}
