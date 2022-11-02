package week06.morning;

public class Task01 {

    public static void main(String[] args) {

        System.out.println(isPrime(6));   // false
         System.out.println(isPrime(11)); // true
         System.out.println(isPrime(101)); // true
        // create loop from 1-100 and print out at the console which numbers are prime
        //  3  --- prime  ,   10  -- not prime

        for (int i = 1; i <= 2022; i++) {
            if(isPrime(i)){
                System.out.println( i + " : is Prime");
            }else{
                System.out.println( i + " : is NOT Prime");
            }
        }
    }

// greater than 1

// exactly two factors, themselves and 1    : can be divided to themselves and 1 only   ex: 7 - 11

    // loop i: ---- 0- 1 - 2 ------number        number % i == 0  it is not prime number   6 % 3 == 0

    // we will create a method with integer parameter and return type should be boolean

    // approach Test Driven Development (TDD): write codes that will fail then correct them to pass

    public static boolean isPrime(int number){    // method signature is ready
        boolean result = true;
// in between logic : will turn our result to false
        if(number <= 1){
            result = false;
        }else{
              for (int i = 2; i < number; i++) {
                if(number % i == 0){
                    result = false;
                    break;
                }
            }
       }
        return result;
    }
}
