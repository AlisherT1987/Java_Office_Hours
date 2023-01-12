package week16.evening;

import java.util.*;

public class Task2 {
    //    get the spartan which has id = 10
    public static void main(String[] args) {

        List<Map<String, Object>> spartans = Spartans.getSpartans();

        // I need to get each map
        for (Map<String, Object> spartan : spartans) {

            //I need to get the id of the map
            int id = (int) spartan.get("id");
            //  String string = spartan.get("id").toString();

            //I need to check the id is 10 or not
            if (id == 10) {
                System.out.println(spartan);
            }

        }

    }
}
