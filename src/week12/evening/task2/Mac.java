package week12.evening.task2;

public class Mac extends Computer{
    public Mac(int memory) {
        super("Mac OS", memory);
    }

    public void openSiri(){
        System.out.println("Siri is openning in Mac");
    }

    public void openSafari(){
        System.out.println("Safari is specific to Mac user which is openning");
    }



}
