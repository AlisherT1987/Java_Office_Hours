package week17.morning;

import java.util.function.Predicate;

public class FunctionalInterface {

    // predicate: returns a boolean value

    Predicate<String> isPalindrome = (p) -> {
        String reverse = new StringBuilder(p).reverse().toString(); // reverses our p string
        return reverse.equalsIgnoreCase(p);
    };

}
