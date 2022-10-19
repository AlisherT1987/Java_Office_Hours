package week04.morning;

public class Task04 {
    public static void main(String[] args) {
        // Ternary Operators: same as if statements, shorter syntax, we use it to assign a value

       // variable = condition?  trueValue: falseValue;

        int a, b, bigger;
        a=30;
        b=20;

        bigger = (a>b)? a : b ; // check if a is bigger than b, then assign a if it is, or b if NOT

        System.out.println("bigger = " + bigger);


    }
}
