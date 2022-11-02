package week06.evening;


import week06.morning.Task08;

public class TaskforCallingMethodFromDifferentPackage {
    public static void main(String[] args) {

        // first import that class then call method
        // import week06.morning.Task08;
        System.out.println(Task08.firstIndexOfWord("java is java", "java"));

    }
}
