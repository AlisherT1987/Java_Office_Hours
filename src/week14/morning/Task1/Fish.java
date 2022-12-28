package week14.morning.Task1;

public class Fish implements Animal{

    @Override
    public void move() {
        System.out.println("fish is swimming");
    }

    public void breathUnderWater(){
        System.out.println("Something specific to fishes");
    }
}
