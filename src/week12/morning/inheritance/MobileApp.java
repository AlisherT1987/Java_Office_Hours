package week12.morning.inheritance;

public class MobileApp {

    private String name;
    private double version;

    public MobileApp(String name, double version){
        setName(name);
        setVersion(version);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void useTheApp(int minutes){
        System.out.println("The app is open for " + minutes + " minutes.");
    }

    public void download(){
        System.out.println(name + " is downloaded.");
    }


}
