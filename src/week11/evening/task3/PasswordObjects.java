package week11.evening.task3;

public class PasswordObjects {

    public static void main(String[] args) {

        Password credentialOfPerson=new Password("Adam1234","Test12345");


        System.out.println(credentialOfPerson);

        credentialOfPerson.setUsername("Magic");
        System.out.println(credentialOfPerson);

        System.out.println(credentialOfPerson.getUsername("Ada"));

        credentialOfPerson.setPassword("Adam1234","Test123456");
        System.out.println(credentialOfPerson);

        System.out.println(credentialOfPerson.getPassword("Adam1234"));


    }
}
