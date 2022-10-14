package week03.evening;

public class Task1 {
    /*
    Task 1:
    Write a Java program that accepts two integers and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
    Input Data
    Input 1st integer: 25
    Input 2nd integer: 5
    Expected Output:
    Input 1st integer: 25
    Input 2nd integer: 5
    Sum of two integers: 30
    Difference of two integers: 20
    Product of two integers: 125
    Average of two integers: 15.00
    Distance of two integers: 20
    Max integer: 25
    Min integer: 5
     */
    public static void main(String[] args) {

// data type variable name=value;

//get the first integer
        int num1 = 25;
//get the second integer
        int num2 = 5;
// get the sum
        System.out.println("========sum========");
        int sum = num1 + num2; //calculate the sum
        System.out.println("sum = " + sum); // print the sum
        System.out.println(sum);
// get the difference
        System.out.println("=========difference========");
        int subtract = num1 - num2;
        System.out.println("subtract = " + subtract);
// get the product
        System.out.println("=====product======");
        int product = num1 * num2;
        System.out.println("product = " + product);
//get the average
        System.out.println("=====average======");
        double avg = (num1 + num2) / 2;
//double avg=sum/2 ;        // also we can use that way
        System.out.println("avg = " + avg);
//float f=100; // implicit casting small data type to bigger one
        System.out.println("=======max-min============");
        int max,min;


        if (num1>num2){
            max=num1;
            min=num2;
        }else {
            max=num2;
            min=num1;

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }


}
