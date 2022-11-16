package week08;

import java.util.Arrays;

public class Taks01 {
    /*
    Write a program that accepts an array and prints an array with the elements "rotated left"

        int[] x = {1,2,3};           // = > [2,3,1]
        0 ----->  length-1
        1 ----->  0
        2 ----->  1
        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]
     */
    public static void main(String[] args) {
        int[] x = {1,2,3};
        System.out.println(Arrays.toString(rotateLeft(x)));
        int[] y = {17,12,10,8};
        System.out.println(Arrays.toString(rotateLeft(y)));
    }

    // will take int[] as parameter and return int[]
    public static int[] rotateLeft(int[] arr){
        int[] rotatedArray = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            rotatedArray[i] = arr[i+1];
        }
            rotatedArray[arr.length-1] = arr[0];
       // rotatedArray[0] = arr[1]; // i = 0 , i+1
        return rotatedArray;
    }

}
