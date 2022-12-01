package week10.evening.task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    /*

2. create a class which is School with main method

3. create a list of student in School class inside the static block

4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"
//homework
5. create a method in School class then you will find the female students

6. create a method in School class then find the students age smaller than 30

7. create a methot in School class then find the students born in 1967 year
     */
    static ArrayList<Student> students=new ArrayList<>();

    static {
    Student student1=new Student("Fatih",'M', LocalDate.of(2000,1,1),1,10);
    Student student2=new Student("Marvin",'M', LocalDate.of(1988,1,1),1,10);
    Student student3=new Student("Sergii",'M', LocalDate.of(1967,1,1),1,10);
    Student student4=new Student("Dan",'M', LocalDate.of(2000,1,1),1,10);
    Student student5=new Student("Vasyl",'M', LocalDate.of(1989,1,1),1,10);
    Student student6=new Student("Alisher",'M', LocalDate.of(2000,1,1),1,10);
    Student student7=new Student("Latifa",'F', LocalDate.of(1967,1,1),1,10);
    Student student8=new Student("Annie",'F', LocalDate.of(1976,1,1),1,10);
    Student student9=new Student("Eshwa",'F', LocalDate.of(2000,1,1),1,10);

        students.addAll(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,
                student9));
    }



    public static void main(String[] args) {
      //  System.out.println(students);

      ArrayList<Student> result=  findStudentsByNameStartWith('F');
        System.out.println(result);
    }

    public static ArrayList<Student> findStudentsByNameStartWith(char firstLetter) {
        ArrayList<Student> result=new ArrayList<>();
        for (Student eashStudent : students) {
            if (eashStudent.name.charAt(0)==firstLetter)
                result.add(eashStudent);
        }
        return result;

    }

}
