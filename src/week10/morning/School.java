package week10.morning;

import java.time.LocalDate;
import java.util.ArrayList;

public class School {
     /*
2. create a class which is School with main method
3. create a list of student in School class inside the static block
        explaination: you have a static field of School class, how to initialize it
4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"
     */

    // Below variable is a Global Variable that can be reached by other methods in the class
    public static  ArrayList<Student> students; // NullPointerException: if we don't initialize

    // How to initialize a static field: answer with a static block

    static {
        students = new ArrayList<>();
    }

    public static void main(String[] args) {

        Student student1 = new Student("Erdal",28,"Male", LocalDate.of(1976,1,1),111);
        Student student2 = new Student("Ayshe",28,"Female", LocalDate.of(1985,1,1),112);
        Student student3 = new Student("Oleksandr",28,"Male", LocalDate.of(1990,1,1),113);
        System.out.println("returnStudentsA(students) = " + returnStudentsA());  // this is empty
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println("returnStudentsA(students) = " + returnStudentsA());



    }

    public static ArrayList<Student> returnStudentsA(){
        ArrayList<Student> result = new ArrayList<>();
        // how to reach name instance variable: with object reference name
        for (Student eachStudent : students) {
            if(eachStudent.name.startsWith("A")){
                result.add(eachStudent);
            }
        }
        return result;
    }

    // How eachStudent reference is representing my Student Object
    // how is it possible that eachStudent object is same with student1 object
/*
          Student student1 = new Student();
          student1 : is this object: Nooooo ---> Reference to our object
          new Student() : is this the object ???
 */


}
