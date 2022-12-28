package week14.morning;

public class TestOf_OOP {
    public static void main(String[] args) {

        // Polymorphism: left side(abstract parent class), right side(child class-concrete)
        Car myCar = new Toyota("Toyota","Corolla");
        myCar.stop();

        Tesla teslaCar = new Tesla("Tesla","Model3");
        teslaCar.stop();
// "Static method can be hidden, can't be overridden"
        myCar.oneCopyMethod();
        teslaCar.oneCopyMethod();

    }
}
