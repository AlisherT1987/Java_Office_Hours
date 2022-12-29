package week14.evening.task1;

public class Cow extends Animal{

    @Override
    protected void move() {
        super.move();
        System.out.println("Cows are walking");
    }
}
