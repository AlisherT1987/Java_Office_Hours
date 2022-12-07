package week11.morning.classObject;

public class OS {  // Operating System

    private String os;

    public OS(String os){
        setOs(os);
    }
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "OS{" +
                "os='" + os + '\'' +
                '}';
    }
}
