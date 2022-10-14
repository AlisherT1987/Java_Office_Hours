package week03.evening;

public class Task3 {
    /*
Task 3:
Write a Java program to compute body mass index (BMI).
BMI: The BMI is defined as the body mass divided by the square of the body height, and is universally expressed in units of kg/m2, resulting from mass in kilograms and height in metres.
Input Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Input weight in pounds: 452
Input height in inches: 72
Body Mass Index is 61.30159143458721
     */

    public static void main(String[] args) {
        int pounds = 452;
        double kg = pounds * 0.45;
        int inches = 72;
        double meter = inches * 0.0254;
        double BMI = kg / (meter * meter);
        System.out.println("BMI = " + BMI);


    }

}
