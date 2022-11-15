package week07.qaTime;

public class Student {
    String name;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="Olga";
        Student student2 = new Student();
        student1.name="Lulia";
        Student student3 = new Student();
        student1.name="Ali";

        Student[] arr = {student1,student2,student3};
    }
}
