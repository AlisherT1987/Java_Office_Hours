package week09.morning;

public class ArrayTask01 {
    public static void main(String[] args) {
        int[] arr1 = {2,5,7,8,10,11,45};
        // call method
        System.out.println("findEvenCount(arr1) = " + findEvenCount(arr1));

        // let's find out of two arrays which one has more even numbers
        int[] arr2 = new int[10];
        arr2[0] = 5;
        arr2[1] = 15;
        arr2[2] = 50;
        arr2[3] = 500;
        arr2[4] = 501;
        arr2[5] = 20;
        arr2[6] = 22;
        arr2[7] = 24;
        arr2[8] = 30;
        arr2[9] = 55;
        System.out.println("findEvenCount(arr2) = " + findEvenCount(arr2));

        if(findEvenCount(arr1) > findEvenCount(arr2)){    // calling method inside if statements
            System.out.println("Array 1 has more even numbers");
        }else {
            System.out.println("Array 2 has more even numbers");
        }


    }
// multi purpose method: doing action like void method(printing) + returning something
    public static int findEvenCount(int[] arr){
        int count = 0;
        /*
        iterate through the Array: take care of each element in the Array
        for with index numbers
        for each loop
         */
        // for with index numbers : if you need the index go with this one
        /*
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
                System.out.println(i+" nth element is even = " + arr[i]);
            }
        } */

        // from Class chat-Elena: to avoid a chance of getting infinite loop let's use for each loop
     //   int i = 0;
        for(int each: arr){
            if(each%2==0){
                count++;
       //         System.out.println(each+" is even "+ " it is "+i+" nth element of the array");
            }
       //     i++;
        }

        return count;
    }
}
