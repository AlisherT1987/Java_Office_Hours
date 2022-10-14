package week03.evening;

public class Task5 {

    /*
    Task 5
Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
Sample Input and Output
Input the first number : 53
Input the second number: 34
Result: true
     */

    public static void main(String[] args) {

        int first = 89;
        int second = 34;


        if ((first >= 25 && first <= 75) && (second >= 25 && second <= 75)) { //important
            int lastOfFirstNumber = first % 10;
            int firstDigitOfFirstNumber = first / 10;
            int lastDigitOfSecondNumber = second % 10;
            int firstDigitOfSecondNumber = second / 10;

            if ((firstDigitOfFirstNumber == firstDigitOfSecondNumber) || (firstDigitOfFirstNumber == lastDigitOfSecondNumber) ||
                    (lastOfFirstNumber == firstDigitOfSecondNumber) ||
                    (lastOfFirstNumber == lastDigitOfSecondNumber)){
                System.out.println(true);
            }else {
                System.out.println(false);
            }


        } else {
            System.out.println(false);
        }


    }
}
