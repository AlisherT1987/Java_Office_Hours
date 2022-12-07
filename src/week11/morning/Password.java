package week11.morning;

import java.util.Scanner;

public class Password {

    private String userName;
    private String passWord;

    Scanner scanner = new Scanner(System.in);

    public Password() {
    }

    public String getUserName() {
        System.out.println("Please enter first 3 characters of your userName");
        String str = scanner.next();
        if (str.equals(userName.substring(0, 3))) {
            return userName;
        } else {
            return "Invalid Entry!";
        }

    }

    public void setUserName() {
        if (userName == null) {
            System.out.println("Please enter a new email as username");
            userName = scanner.next();
        } else {
            System.out.println("Username is already set, did you forget UserName? Click Link !");
        }
    }

    public String getPassWord() {
        // if we don't have password initilialized we will set first
        if (passWord == null) {
            setPassWord();
            return passWord;
        } else {
            System.out.println("Please enter your userName");
            String str = scanner.next();
            if (str.equals(userName)) {
                return passWord;
            } else {
                return null;
            }
        }

    }

    public void setPassWord() {
        System.out.println("Please enter your userName");
        String str = scanner.next();
        if (str.equals(userName)) {
            System.out.println("Password is Null, assign a value for it");
            passWord = scanner.next();
        } else {
            System.out.println("Invalid Entry");
            System.exit(-1);
        }
    }

}
