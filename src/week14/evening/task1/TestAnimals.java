package week14.evening.task1;

public class TestAnimals {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move(); //Animals are moving. Bird is flying.
        System.out.println("===================");
        Fish fish = new Fish(); //Animals are moving. Fish is swimming.
        fish.move();

        System.out.println("===================");


        Cow cow=new Cow();

        cow.move();

    }
}
