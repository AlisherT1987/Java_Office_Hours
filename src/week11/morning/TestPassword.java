package week11.morning;

public class TestPassword {
    public static void main(String[] args) {

        Password password = new Password();

        password.setUserName();

        System.out.println(password.getUserName());

        System.out.println("password.getPassWord() = " + password.getPassWord());


    }
}
