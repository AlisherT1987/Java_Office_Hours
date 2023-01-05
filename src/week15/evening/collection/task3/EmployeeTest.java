package week15.evening.collection.task3;

import java.util.*;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee5=new Employee(9,"Adam");
        Employee employee1=new Employee(1,"Betul");
        Employee employee2=new Employee(2,"Attia");
        Employee employee3=new Employee(3,"Nihal");
        Employee employee4=new Employee(4,"Alisher");
        Employee employee6=new Employee(8,"Alisher");
        Employee employee7=new Employee(10,"Adam");
        Employee employee8=new Employee(11,"Alisher");
        Employee employee9=new Employee(1,"Betul");

        List<Employee> employees=new ArrayList<>(Arrays.asList(employee1,employee2,employee6,employee5,employee7,employee3,employee4,employee8,employee9));


        List<String> uniqueNames=getUniqueNames(employees);

        System.out.println(uniqueNames);


    }

    private static List<String> getUniqueNames(List<Employee> employees) {
        Set<String> names=new TreeSet<>();

     //   employees.forEach(k->names.add(k.name));
        for (Employee employee : employees) {
            names.add(employee.name);
        }

     return    new ArrayList<>(names);

    }
}
