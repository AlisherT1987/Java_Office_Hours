package week11.evening.task2;

public class Login {

    public static void main(String[] args) {
        Credentials credentials=new Credentials("Adam123","Test2345");
        System.out.println(credentials.getUsername());
        System.out.println(credentials.getPassword());
        credentials.setPassword("Test12345");
        System.out.println(credentials.getPassword());

        /* put your conditions  for password
        - at least one upper case
        - at least one special chars
        - do not use spacein your passsword


        __________________
        conditon for username
        - you can only use letter and digit and .

         */
    }
}
