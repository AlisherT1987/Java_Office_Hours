package week08.evening;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {


        //we can put one value inside the one variable
        int a = 5;
        // I want to put multiple values in one variable
        //I want to put 5 numbers inside the variable
        // if we don't know the values e need to use new keyword

        // data type  arrays symbol
             int       []             numbers=  new int[5];
             numbers[0]=12;
             numbers[1]=13;
             numbers[2]=14;
             numbers[3]=15;
             numbers[4]=16;
        // how we can print that values
        System.out.println(Arrays.toString(numbers));

        // in order to print a
        System.out.println(a);


        // how to create an array if we know the values
                  //indexes    0         1        2           3          4          5          6

        String [] weekDays={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("weekDays[3] = " + weekDays[3]);
                         //it is giving me the length of array

        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }

        //itar it will create one fori loop then print your elemnets one by one

        for (int i = 0; i < weekDays.length; i++) {
            String weekDay = weekDays[i];
            System.out.println(weekDay);

        }

    }
}
