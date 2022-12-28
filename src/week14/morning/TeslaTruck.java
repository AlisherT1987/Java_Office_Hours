package week14.morning;

public class TeslaTruck extends Tesla{

    public TeslaTruck(String make, String model) {
        super(make, model);
    }

    @Override
    public void drive() {
        System.out.println("Even More specific implementation of Drive action from Tesla Truck");
    }
}
