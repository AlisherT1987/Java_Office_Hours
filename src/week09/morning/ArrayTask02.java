package week09.morning;

public class ArrayTask02 {
    public static void main(String[] args) {
        int[] x = {10,3,5,6} ;  // 7
        int[] y = {7,2,10,9} ;  // 8
        System.out.println("differenceBetweenMaxAndMinOfArray() = " + differenceBetweenMaxAndMinOfArray(x));
        System.out.println("differenceBetweenMaxAndMinOfArray() = " + differenceBetweenMaxAndMinOfArray(y));
    }


    public static int differenceBetweenMaxAndMinOfArray(int[] arr){
        int difference = 0;
        int max = Integer.MIN_VALUE;  // int max = arr[0];
        int min = Integer.MAX_VALUE;  // int min = arr[0];
        for(int each: arr){
            if(each>max){
                max = each;
            }
            if(each<min){
                min = each;
            }
       }
        difference = max -min;
        System.out.println("difference = " + difference);
        return difference;
    }
}
