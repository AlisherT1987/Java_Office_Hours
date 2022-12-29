package week14.evening.task1;

public class Fish extends Animal {

    @Override
    protected void move() {
        super.move(); //Animals are moving
        System.out.println("Fish is swimming");
    }

}
