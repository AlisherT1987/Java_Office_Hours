package week08.evening;

import java.util.Arrays;

public class Task1_RotateLeft {

    /*
        Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"

        int[] x = {1,2,3};           // = > [2,3,1]
        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]
     */

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};

        /*
        int temp=x[0]; // we don't want to lose data in first place so we can store that data in one variable
        x[0]=x[1];  // get the second element put inside first element
        x[1]=x[2];// get the third element put inside second element
        x[i]=x[i+1]
        x[2]=temp;  // get the first element put inside the last

         */


        int temp=x[0]; // we are storing our first data in order to use later

        for (int i = 0; i <x.length -1; i++) {
            x[i]=x[i+1]; // shifting data from right to left
        }
        x[x.length-1]=temp; // we are putting first data into the last place
        System.out.println(Arrays.toString(x));


    }
}
