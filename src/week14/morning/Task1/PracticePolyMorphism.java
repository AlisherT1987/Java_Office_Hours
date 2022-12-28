package week14.morning.Task1;

public class PracticePolyMorphism {
    public static void main(String[] args) {

        Animal animal = new Fish();
        animal.move();
        // Down casting: the reason is Animal Class do not have breathUnderWater() method
        /*
        Reference type decides just which methods the instance can use. But instance side uses own class method versions. So if Derived class had another method which parent class doesn't have, Derived would not be able to use or reach it.
         */
        ((Fish)animal).breathUnderWater();

    Animal salmonFish = new Salmon();
    salmonFish.move();  // JVM looks for more specific implementation

        salmonFish = new Fish();
        salmonFish.move();


    }
}
