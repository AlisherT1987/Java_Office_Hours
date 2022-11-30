package week10.morning;

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
     */
    String name;   // if you are using these attributes in the same class you can declare private
    int age;        // in the same package you can use default
    int batchNumber;

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

    public void someInstanceMethod(){
        this.toString();
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student();  // this line is giving error: there isn't any NO PArameter constructor
        student1.name="Hamid";
        System.out.println("Student.school = " + Student.school);
    }
}
