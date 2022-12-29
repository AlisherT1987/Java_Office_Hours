package week14.evening.task1;

public class Bird extends Animal{

    @Override
    protected void move() {
        super.move();
        System.out.println("Birds are flying");
    }
}
