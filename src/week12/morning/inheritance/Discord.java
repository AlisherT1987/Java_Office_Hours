package week12.morning.inheritance;

public class Discord extends MobileApp {

    public Discord(String name, double version){
        super(name, version);
    }

    MobileApp mobileAppDiscord = new MobileApp("Discord", 10.3);


    public void chat(String name){
        System.out.println("chatting with "+ name);
    }
}
