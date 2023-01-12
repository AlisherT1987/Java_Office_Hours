package week16.evening;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task4 {
    //get the spartans which are male
    public static void main(String[] args) {
        List<Map<String, Object>> spartans = Spartans.getSpartans();
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map<String, Object> spartan : spartans) {
                             //Object
            String gender = spartan.get("gender").toString();
            if (gender.equals("Male"))
                result.add(spartan);
        }
        System.out.println(result);

    }
}
