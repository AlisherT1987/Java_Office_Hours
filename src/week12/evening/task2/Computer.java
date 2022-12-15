package week12.evening.task2;

public class Computer {

    public String OS;
    //512
    public int memory;

    public Computer(String OS, int memory) {
        this.OS = OS;
        this.memory = memory;
    }


    public void start(){
        System.out.println(OS + " is starting");
    }

    public void shuddown(){
        System.out.println(OS + " is shutting down");
    }


    public void info(){
        System.out.println("The Operating System is " + OS + " the memory is " +memory + " GB." );
    }


    public String toString() {
        return "Computer{" +
                "OS='" + OS + '\'' +
                ", memory=" + memory +
                '}';
    }
}
