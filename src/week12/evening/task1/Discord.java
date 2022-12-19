package week12.evening.task1;
                    //IS A
public class Discord extends MobileApp{

    //if we do not have constructor in a class compiler is creating one for us which is default constructor

public Discord(double version){
    super("Discord",version);
}

public void chat(String name){
    System.out.println("I am chatting with " + name + " with Discord");
}





}
