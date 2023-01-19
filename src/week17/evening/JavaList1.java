package week17.evening;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sizeOfList=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            list.add(scanner.nextInt());

        }
        int query=scanner.nextInt();
        for (int i = 0; i < query; i++) {
            String action=scanner.next();
            int index=0;
            int value=0;
            if (action.equals("Insert")) {
                index=scanner.nextInt();
                if (index<0 || index>sizeOfList){
                    System.out.println("your index is not correct give me correct index smaller than size of list " +
                            "which is "+sizeOfList);
                    index=scanner.nextInt();
                }
                value=scanner.nextInt();
                list.add(index,value);
            }
            if (action.equals("Delete")) {
                index=scanner.nextInt();
                list.remove(index);
            }
        }
        System.out.println(list);





    }
}
