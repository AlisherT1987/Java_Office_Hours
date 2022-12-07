package week11.morning;

public class Person {

    private String firstName, lastName;
    private int age;

    public Person() {
        firstName = getFirstName();
        lastName = "undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        if(firstName == null){
            firstName="undefined";
        }
       return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " | " + lastName + " | " + age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
    }


}
