package week06.evening;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        int result = sum(4, 5); // get result

        //print
        multiplyWith2(result);
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        sum(number1, number2, number3);

    }

    private static void multiplyWith2(int result) {
        System.out.println(result * 2);
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
