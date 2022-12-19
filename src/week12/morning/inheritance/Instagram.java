package week12.morning.inheritance;

public class Instagram extends MobileApp {

    public Instagram(String name, double version){
        super(name, version);

    }

    public void postPhoto(){
        System.out.println("photo is posted");
    }
}
