package week12.morning.inheritance;

public class Mac extends Computer{

    public Mac(String os, int memory){
        super(os, memory);
    }

    public void openSiri(){
        System.out.println("Siri is opening");
    }

    public void openSafari(){
        System.out.println("Safari is opening");
    }
}
