package week12.evening.task1;

public class MobileApp {

    public String name;
    public double version;

    public MobileApp(String name, double version) {


        this.name = name;
        this.version = version;
    }



    public void useTheApp(int minutes){
        //you are using Discord for 12 minutes
        System.out.println("you are using "+ name + " for " +minutes + " minutes" );
    }
    public void download(){
        // you are downloading Discord with 4.5
         System.out.println("you are downloading " + name + " with " + version+ " version!!!!");
    }


    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
