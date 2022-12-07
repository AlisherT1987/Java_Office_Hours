package week11.morning;

public class Credentials {

    private String userName = "CoolPerson@cydeo.com";
    private String passWord = "Cool_Password#123";

    public String getUserName() {
        return userName;
    }

    public String getPassWord(String userName) {
        if(userName.equals(this.userName)){
            return passWord;
        }
        return null;
    }

    public void setPassWord(String userName, String passWord) {
        if(userName.equals(this.userName)){
            this.passWord = passWord;
        }
    }
}
