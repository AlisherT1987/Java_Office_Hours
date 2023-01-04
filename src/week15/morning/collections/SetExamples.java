package week15.morning.collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<String> browserTypes = new HashSet<>();
        browserTypes.addAll(Arrays.asList("chrome","firefox","chrome","safari","opera",null)); // duplicate results removed
        System.out.println("browserTypes = " + browserTypes);

        Set<String> browserTypes_linked = new LinkedHashSet<>();
        browserTypes_linked.addAll(Arrays.asList("chrome","firefox","chrome","safari","opera",null));
        System.out.println("browserTypes_linked = " + browserTypes_linked);

        Set<String> browserTypes_treeset = new TreeSet<>();
        browserTypes_treeset.addAll(Arrays.asList("chrome","firefox","chrome","safari","opera"));
        System.out.println("browserTypes_treeset = " + browserTypes_treeset);
    }
}
