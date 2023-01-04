package week15.morning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CollectionsInGeneral {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Awa");
        students.add("Irina");
        students.add("Vladislav");
        System.out.println(students);  // indexed
        students.add("Awa");  // duplicates allowed
        System.out.println(students);

        students.add(null);
        students.add(null);
        students.add("Serhan");
        System.out.println(students); // add multiple null values

        List<String> students_stack = new Stack<>();
        students_stack.addAll(students);
        System.out.println("((Stack)students_stack).pop() = " + ((Stack) students_stack).pop());

        Collections.sort(students); // does not work with null values
        System.out.println("students = " + students);




    }
}
