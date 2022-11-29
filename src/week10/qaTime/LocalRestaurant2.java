package week10.qaTime;

import java.util.ArrayList;

public class LocalRestaurant2 {
    public static void main(String[] args) {

        ArrayList<Chef> chefs = new ArrayList<>();
        Chef chef1 = new Chef("Osman",107,50,true);
        Chef chef2 = new Chef("Ali",108,40,true);
        chefs.add(chef1);
        chefs.add(chef2);
        Restaurant localRestaurant2 = new Restaurant("Nusret","Dubai",5,chefs);
        System.out.println(localRestaurant2);

    }
}
