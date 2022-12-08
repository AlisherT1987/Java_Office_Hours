package week11.evening.task1;

public class PersonObjects {

    public static void main(String[] args) {
       Person person=new Person();
        System.out.println(person);
        Person person1=new Person("Adam","Barry",33);
        System.out.println(person1);

        Person person2=new Person("Tulay","Durmaz",18);
        System.out.println(person2);
        Person person3=new Person("12233","123 4*",-33); //homework is put your conditions in your person class
        //do not use digit, space , special chars in names
        //age will not be smaller than 0
        System.out.println(person3);

    }
}
