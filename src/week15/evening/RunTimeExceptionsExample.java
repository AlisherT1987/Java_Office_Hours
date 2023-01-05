package week15.evening;

import week07.evening.Employee;

public class RunTimeExceptionsExample {

    static Employee employee;


    public static void main(String[] args) {
        //ArithmeticException
        /*
        windows : ctrl+alt+T
        mac     : command+alt+T
         */

        try {
            for (int i = 6; i >=0; i--) {
                System.out.println(120 / i);
            }
        } catch (ArithmeticException e) {
          //  e.printStackTrace();
        //    System.out.println(e.getMessage());
        }

        //NullPointerException

        try {
          //  employee=new Employee();

            System.out.println(employee.age);
        } catch (Exception e) {

        }
        //NumberFormatException

        String str="Adam 123";

       // int number=Integer.parseInt(str.substring(4)); //if you write 4 by mistake you will get an exception
     //   System.out.println(number);

    }
}
