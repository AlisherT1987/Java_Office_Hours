package week17.evening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaList2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfElement = scanner.nextInt();

        String[] arr = new String[countOfElement];
        scanner.nextLine();
        arr = scanner.nextLine().split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        int query = scanner.nextInt();
        for (int i = 0; i < query; i++) {
            String act = scanner.next();
            int index = 0;
            String value = "";


            switch (act) {

                case "Insert":
                    scanner.nextLine();
                    String[] queryInsert = scanner.nextLine().split(" ");
                    index = Integer.parseInt(queryInsert[0]);
                    value = queryInsert[1];
                    list.add(index, value);
                    break;
                case "Delete":
                    scanner.nextLine();
                    index = scanner.nextInt();
                    list.remove(index);
                    break;

            }
        }
        System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
    }
}
