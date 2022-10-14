package week03.morning;

public class Task03 {
    public static void main(String[] args) {
        // Write a Java program to compute body mass index (BMI).
        // BMI = weight / height*height (kg/m2)  less than 25: healthy

        double BMI, weight, height;

        weight = 105;
        height = 1.78;

        BMI = weight / (height*height);
        // precedence of operators : parenthesis comes first

        System.out.println("BMI = " + BMI);
    }
}
