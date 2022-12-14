package week12.morning.inheritance;


public class Browser {

    private String name;
    private double version;

    public  String color = "black";

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

    public Browser(String name, double version){
        setVersion(version);
        setName(name);
    }

    @Override
    public String toString() {
        return "Browser{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

    public void open(){
        System.out.println("browser is opening");
    }

    public void close(){
        System.out.println("browser is closing");
    }


}