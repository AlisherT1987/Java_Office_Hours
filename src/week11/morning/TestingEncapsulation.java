package week11.morning;

public class TestingEncapsulation {
    public static void main(String[] args) {

        Credentials credentials = new Credentials();
        // Below lines give Error
       // System.out.println("unprotected password :"+ credentials.passWord);
      //  credentials.userName = "DangerousEntry1234";
      //  System.out.println(credentials.userName);

        System.out.println("credentials.getUserName() = " + credentials.getUserName());

        System.out.println("credentials.getPassWord(\"wrongUser\") = " + credentials.getPassWord("wrongUser"));
        System.out.println("credentials.getPassWord(\"CoolPerson@cydeo.com\") = " + credentials.getPassWord("CoolPerson@cydeo.com"));

        credentials.setPassWord("CoolPerson@cydeo.com","someNewPassword123");

        System.out.println("credentials.getPassWord(\"CoolPerson@cydeo.com\") = " + credentials.getPassWord("CoolPerson@cydeo.com"));

        System.out.println("credentials.getUserName() = " + credentials.getUserName());
    }
}
