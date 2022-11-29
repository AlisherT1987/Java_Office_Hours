package week09.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5_WithDubName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mike", "Adam", "Alvin", "Hamid", "Tijana", "Adam"));

        String searched = "Adam";
        ArrayList<Integer> indexesOfNames = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).equals(searched))
                indexesOfNames.add(i);
        }
        System.out.println("indexes = " + indexesOfNames);
        int index = 0;
        ArrayList<Integer> indexesOfNames2 = new ArrayList<>();

        for (String name : names) {



            if (name.equals(searched))
                indexesOfNames2.add(index);

            index++;
        }

        System.out.println("indexesOfNames2 = " + indexesOfNames2);

    }
}
