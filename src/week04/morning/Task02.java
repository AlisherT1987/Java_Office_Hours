package week04.morning;

public class Task02 {
    public static void main(String[] args) {
    /*
    Given a character, the task is to check whether the given character is in upper case, lower case, or non-alphabetic 		character

							Input: ch = 'A'                         if( 'A'<input && input < 'Z')
							Output: A is an UpperCase character

							Input: ch = 'a'                          if( 'a'<input && input < 'z')
							Output: a is an LowerCase character

							Input: ch = '0'
							Output: 0 is not an aplhabetic character

							We have 3 conditions and they tied together, depended on each other, if one condition is TRUE the other condition CAN NOT be true
     */

        char input = 'Z';
        String output = "Output : ";

        if('A'<= input && input <= 'Z'){
            output += input + " is an UpperCase character";
        }else if( 'a'<= input && input <= 'z' ){
            output += input + " is an LowerCase character";
        }else{
            output += input + " is not an aplhabetic character";
        }

        System.out.println(output);
    }

}
