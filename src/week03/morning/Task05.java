package week03.morning;

public class Task05 {
    public static void main(String[] args) {

       /*
       Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
        */

        int p , q ;
        p = 35;
        q = 45;
        int digitP1, digitP2;
        int digitQ1, digitQ2;

        boolean result ;  // this will hold my operation result
// (p<25 && p>75 && q<25 && q>75)  --- This will not work: && is used if you want to satify all the conditions
        if(p<25 || p>75 || q<25 || q>75){
            result = false;
        }else{
            digitP1 = p % 10;
            digitP2 = p / 10;
            digitQ1 = q % 10;
            digitQ2 = q / 10;
//            System.out.println("digitQ1 = " + digitQ1);
//            System.out.println("digitQ2 = " + digitQ2);
//            System.out.println("digitP1 = " + digitP1);
//            System.out.println("digitP2 = " + digitP2);

         result = (digitP1 == digitQ1 || digitP1 == digitQ2) || (digitP2 == digitQ1 || digitP2 == digitQ2);
        }

        System.out.println("result = " + result);


    }
}
