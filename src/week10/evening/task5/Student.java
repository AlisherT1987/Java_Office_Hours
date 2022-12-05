package week10.evening.task5;

import java.time.LocalDate;

public class Student {

    /*

Task 5 :

1. create a class named Student that has the followings features:
			Attributes:
				name, gender, dateOfBirth(use LocalDate), age, studentID, grade

			Methods:
				sets all the attributes of the student object
				toString(): returns the full info of student Object

2. create a class which is School with main method

3. create a list of student in School class inside the static block

4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"


     */

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age, studentID, grade;

    public Student(String name, char gender, LocalDate dateOfBirth, int studentID, int grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = calculateAge(dateOfBirth);
        this.studentID = studentID;
        this.grade = grade;
    }

    public int calculateAge(LocalDate dateOfBirth){
      return   LocalDate.now().getYear()- dateOfBirth.getYear();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
