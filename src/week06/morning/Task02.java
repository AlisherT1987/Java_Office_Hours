package week06.morning;

public class Task02 {
    public static void main(String[] args) {
        /*
        Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

				Armstrong numbers are     === 153 370 371 407 === for 3 digits
				153
				1 : 1*1*1   =  1
				5 : 5*5*5   = 125
				3 : 3*3*3   = 27
				+------     153         153 == 153  --- Armstrong number

				method signature : takes integer  --- returns boolean

         */

        System.out.println("isArmstrong(153) = " + isArmstrong(153));

        for (int i = 100; i < 10000 ; i++) {
            if(isArmstrong(i)){
                System.out.println(i + " : isArmstrong = " + isArmstrong(i));
            }
        }

    }


    public static boolean isArmstrong(int number){
        boolean result = false;
        int originalNumber = number;
        int lastDigit = 0 ;
        int totalOfDigitsPowerThree = 0;
        // if the number is Armstrong result should turn into true

        // loop through your number to reduce until the number is equal to zero
        while (number > 0){

            lastDigit = number % 10;  // 3  ,  5   ,  1

            number/=10;  // 153 --> 15  ---> 1  --->  0

            totalOfDigitsPowerThree += lastDigit*lastDigit*lastDigit;  // 27 + 125 + 1  = 153

        }

        if(originalNumber == totalOfDigitsPowerThree ){
            result = true;
        }

        return  result;
    }


}
