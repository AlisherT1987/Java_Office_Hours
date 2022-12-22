package week13.morning.abstraction;

public class AtTheGym {
    public static void main(String[] args) {
        Swimming swimming = new Swimming(90);
        FreeWeight freeWeight = new FreeWeight(90);

        swimming.start();
        swimming.perform();
        System.out.println("swimming.getCalories(60) = " + swimming.getCalories(60));

        // polymorphism

        // parent class or Interface -- > Object Reference
        // Object itself is created from child class
        Exercise lifting = new FreeWeight(90);
        // lifting object is created as a multiple form and shape
        lifting.perform();
        lifting.getCalories(30);



    }
}
