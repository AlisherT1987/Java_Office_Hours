package week11.evening.task1;

public class Person {

    private String firstName, lastName;
    private int age;

    //constructors

//this is not default constructor this is no arg const
    public Person() {
        //change the default values
        this.firstName="undefined";
        this.lastName="undefined";
        this.age=-1;
    }

    public Person(String firstName, String lastName, int age) {
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    }

    //first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName+" | "+lastName + " | " +age;
    }
}
