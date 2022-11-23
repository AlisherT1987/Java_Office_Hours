package week09.morning;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /*
        Write a Java program to insert an element into the array list at the first position. Then retrieve an element (at a specified index) from the array list. Then update specific array element by given element. Lastly remove the third element from the array list.
         */

        // create 5 different objects of Car class and store them inside an Arraylist, then loop through each of them to find which one has max price????????

        Car OsCar = new Car();
        OsCar.setInfo("Dacia","Duster",2022,25000,"Orange");
        Car SerCar = new Car();
        SerCar.setInfo("Lexus","IS350",2019,35000,"White");
        Car HaCar = new Car();
        HaCar.setInfo("Tesla", "Model3",2023, 49000, "White");
        Car MaCar = new Car();
        MaCar.setInfo("BMW","X6",2023,55000,"Red");
        Car TayCar = new Car();
        TayCar.setInfo("Honda","Crosstour",2015, 30000,"White");

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(OsCar,SerCar,HaCar,MaCar,TayCar));
        double maxPrice = Double.MIN_VALUE;
        for(Car eachCar : carList){
           // System.out.println(eachCar.toString());
            if(eachCar.price>maxPrice){
                maxPrice=eachCar.price;
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        for(Car eachCar : carList){
           if(eachCar.price==maxPrice){
               System.out.println("eachCar.toString() = " + eachCar.toString());
           }
        }


        Car[] carArray = carList.toArray(new Car[0]);  // to turn arraylist into an array
        System.out.println(carArray[0].make); // Dacia

    }
}
