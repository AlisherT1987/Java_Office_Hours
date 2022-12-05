package week11.qa_time;

public class Browser {   // Parent class shares it's atts and actions with child classes
    String name;
    String version;

    // default constructor


    public Browser() {
    }

    public Browser(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void open(){
        System.out.println("Opening "+this.name);
    }
}
