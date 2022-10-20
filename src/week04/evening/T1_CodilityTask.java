package week04.evening;

public class T1_CodilityTask {
    /*
     Task 1:
  Write a function:
			that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

			- If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

				    			EXPECTED

				    	numbers divisible by both 2 and 3 should be replacée by CodilityTest
				    	INPUT : 6    OUTPUT :  CodilityTest

				    	numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
				    	INPUT : 30    OUTPUT :  CodilityTestCoders

     */
    public static void main(String[] args) {

        int number = 30; //CodilityTestCoders

        if (number>0){ //positive
            //we will do somme actions
            String result="";

            if (number%2==0){
                result+="Codility"; //result=Codility
            }

            if (number%3==0){
              //  result=result+"Test";
                result+="Test"; //do not delete Codility add Test
            }

            if (number%5==0){ //do not delete Test add Coders
                result+="Coders";
            }
            System.out.println(result);


        }else {
            System.out.println("negative number or zero");

        }

    }
}
