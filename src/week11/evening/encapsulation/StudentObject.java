package week11.evening.encapsulation;

public class StudentObject {
    public static void main(String[] args) {
        Student student=new Student("Hamid",18);
        System.out.println(student);
      //  student.name="123456";

        student.setName("Sajjad");
        System.out.println(student.getName());
        // student.age=-18;
        student.setAge(32);


        System.out.println(student);


        System.out.println("=====================");
        Student student1=new Student("Ozgun",30);
        System.out.println(student1);








    }
}
