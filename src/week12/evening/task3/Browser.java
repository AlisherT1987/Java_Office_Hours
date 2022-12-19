package week12.evening.task3;

public class Browser {

   public String name;
   public double version;

    public Browser(String name, double version) {
        this.name = name;
        this.version = version;
    }


    public void open(){
       // System.out.println(name+ " is openning");
        System.out.println(getClass().getSimpleName() +" is openning");
    }

    public void close(){

        System.out.println(getClass().getSimpleName() +" is closing");
    }

    @Override
    public String toString() {
        return "Browser{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
