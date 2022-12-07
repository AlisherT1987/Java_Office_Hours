package week11.morning;

import java.util.Scanner;

public class PasswordWeird {

    private static String passWord;

    static Scanner scanner = new Scanner(System.in);

    private PasswordWeird(){

    }

    public static String getPassWord(){
        if(passWord == null){
            System.out.println("Enter password");
            passWord = scanner.next();
            return passWord;
        }else{
            return passWord;
        }
    }


}
