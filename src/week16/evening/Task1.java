package week16.evening;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*
    Task 1:

 Create a Spartan map has keys :

1- id
2- name
3- gender
4- phone

     */
    public static void main(String[] args) {
        Spartan spartan1=new Spartan();
        Map<String,String> spartan=new HashMap<>();
        //in order to add key value structure we are using put method
        spartan.put("id","10");
        spartan1.setId("10");
        spartan1.setId(spartan.get("id"));

        spartan.put("name","Adam");
        spartan1.setName("Adam");

        spartan.put("gender","Male");
        spartan1.setGender("Male");

        spartan.put("phone","0132456789");
        spartan1.setPhone("0132456789");

        //========================================================

        Map<String,Object> spartan2=new HashMap<>();
        spartan2.put("id",10);
        spartan2.put("name","Betul");
        spartan2.put("gender","Female");
        spartan2.put("phone",1123456789L);

























    }
}
