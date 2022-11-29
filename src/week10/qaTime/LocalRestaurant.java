package week10.qaTime;

import java.time.LocalDate;
import java.util.ArrayList;

public class LocalRestaurant {
    public static void main(String[] args) {

       // - Make a Restaurant object
       Restaurant oliveGarden = new Restaurant("Alfredo","Virginia",3);

       //         - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object

        // we are creating an object with reference name: server1
        Server server1 = new Server("Erdal",121, 20, true, LocalDate.of(2019,8,15));
        Server server2 = new Server("Oscar",123, 15, true, LocalDate.of(2021,5,15));
        Server server3 = new Server("Lulia",124, 18, false, LocalDate.of(2020,6,15));

        Server[] servers ={
                server1,
                server2,
                server3
        };

        oliveGarden.hireServer(servers);
        System.out.println(oliveGarden);

        Chef chef1 = new Chef("Muhtar",101,30,true);
        Chef chef2 = new Chef("Asya",102,35,true);
        Chef[] chefs = {chef1,chef2};
        oliveGarden.hireChefs(chefs);

        System.out.println(oliveGarden);


        Restaurant restaurant = new Restaurant();
        restaurant.hireChefs(chefs);

        oliveGarden.terminateServer(121);
        System.out.println(oliveGarden);
        oliveGarden.terminateChef(102);
        System.out.println(oliveGarden);


    }
}
