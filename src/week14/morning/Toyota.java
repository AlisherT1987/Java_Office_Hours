package week14.morning;

public class Toyota extends Car{
    public Toyota(String make, String model) {
        super(make, model);
    }

    @Override
    void drive() {
        System.out.println("Implementing abstarct method of Car class");
    }
}
