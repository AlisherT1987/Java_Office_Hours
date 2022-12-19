package week12.morning.inheritance;

import java.util.*;

public class Computer {

    private String os;
    private  int memory;

    public Computer(String os, int memory){
        setOs(os);
        setMemory(memory);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void start(){
        System.out.println("Computer is starting");
    }

    public void shutDown(){
        System.out.println("Computer is shutting down");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
