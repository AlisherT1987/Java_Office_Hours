package week11.evening.task2;

public class Credentials {

   private String username;
   private String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
      boolean isValid=  checkPassword(password);
        this.password = password;
    }

    private boolean checkPassword(String password) {
        int numberOfUpperCaseLetter=0;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                numberOfUpperCaseLetter++;

        }

        if (numberOfUpperCaseLetter>0)
            return true;
        else
            return false;

    }
}
