package week11.evening.task3;

public class Password {


    private String username, password;


    public Password(String username, String password) {
        setUsername(username);
        setPassword(username,password);

    }
//username
    public String getUsername(String prefix) {
        if (username.substring(0,3).equals(prefix))
        return username;
        else
            return null;
    }

    public void setUsername(String username) {
        if (this.username==null){
            this.username = username;
        }

    }
//password


    public String getPassword(String username) {
        if (username.equals(this.username) && password!=null)
        return password;
        else return "please enter correct username or check password is null";
    }

    public void setPassword(String username,String password) {
        //do not forget we willl come back
        if (this.username.equals(username))
        this.password = password;
        else
            this.password=null;
    }


    public String toString() {
        return "username: " +username + " | password: " +password;
    }
}
