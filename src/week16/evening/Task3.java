package week16.evening;

import java.util.*;

public class Task3 {
//get the spartans has id smaller than 6
    public static void main(String[] args) {
        List<Map<String, Object>> spartans = Spartans.getSpartans();

        List<Map<String,Object>> listOfSpartansIdIsSmallerThan6=new ArrayList<>();

        for (Map<String, Object> spartan : spartans) {
            if ((int)spartan.get("id")<6)
                listOfSpartansIdIsSmallerThan6.add(spartan);
        }

        System.out.println(listOfSpartansIdIsSmallerThan6);
    }
}
