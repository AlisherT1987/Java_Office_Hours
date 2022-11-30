package week10.morning;

import java.time.LocalDate;

public class Student {
    /*
    Class Name: Student
            instance variables:
                    name, age, batchNumber
            static variables :
                    school
            1st constructor: initializes the name ONLY
            2nd constructor: initializes name & age
                        (MUST use constructor call to set the name)
            3rd Constructor: initializes name, age ,batchNumber
                        (MUST use constructor call to set the name & age)
            instance methods: toString()

            From Task 05:
             Attributes:
                name, gender, dateOfBirth(use LocalDate), age, studentID, batchNumber


     */
    String name;   // if you are using these attributes in the same class you can declare private
    int age;        // in the same package you can use default
    int batchNumber;
    String gender;
    LocalDate dateOfBirth;
    int studentID;

    static String school;

    static {
        school = "Cydeo";
    }

    Student() {   // no parameter and default access modifier
    }

    public Student(String name){  // one parameter
        this();
        this.name = name;
    }

    public Student(String name, int age) {
       this(name);
        this.age = age;
    }

    public Student(String name, int age, int batchNumber) {
       this(name,age);
       this.batchNumber = batchNumber;
    }

    public Student(String name, int batchNumber, String gender, LocalDate dateOfBirth, int studentID) {
        this.name = name;
        age = (LocalDate.now().getYear()-dateOfBirth.getYear());
        this.batchNumber = batchNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
    }

    public void someInstanceMethod(){
        this.toString();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", studentID=" + studentID +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student();  // this line is giving error: there isn't any NO PArameter constructor
        student1.name="Hamid";
        System.out.println("Student.school = " + Student.school);
    }
}
