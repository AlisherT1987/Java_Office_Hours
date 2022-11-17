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

        //===================================================
        //print the elements


        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }
                   //0123
        String name="Adam";


        //print the letter chars one by one

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        char[] chars = name.toCharArray();// char[] chars={'A','d','a','m'}

        for (char eachCharacter : chars) {
            System.out.println(eachCharacter);
        }
        //iter short cut for foreach loop
        for (char aChar : chars) {

        }
        //===================================================

        // if you want to create 2 dimensional array we need to use 2 [][]

        int [][] TwoDimension={

                {1,2,3},  // first 1 Dimension array // index=0
              // 0 1 2
                {4,5,6},  // second 1 Dimension array //index=1
              // 0 1 2
                {7,8,9}  //third 1 Dimension array   //index=2


        };
        System.out.println("=======================================");
        // get the number 5

        System.out.println(TwoDimension[1][1]);

        // get the number 8
        System.out.println(TwoDimension[2][1]);
                            //3

        for (int i = 0; i < TwoDimension.length; i++) { // first loop for getting each ARRAY

            for (int j = 0; j < TwoDimension[i].length; j++) { // second loop for getting each  ELEMENT
                System.out.println(TwoDimension[i][j]);
            }

        }


        for (int[] EachDimensionalArray : TwoDimension) { // the first for getting each array
            for (int eachElement : EachDimensionalArray) { // th second one for getting element
                System.out.println(eachElement);
            }

        }







    }
}
