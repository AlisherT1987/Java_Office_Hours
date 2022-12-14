package week12.morning.inheritance;

public class Windows extends Computer{

    public Windows(String os, int memory){
        super(os, memory);
    }


    public void openEdge(){
        System.out.println("Edge is opening");
    }
}
