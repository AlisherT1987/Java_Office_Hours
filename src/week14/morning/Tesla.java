package week14.morning;

public class Tesla extends Car{

    public Tesla(String make, String model) {
        super(make, model);
    }

    @Override
    protected void drive() {
        System.out.println("More specific action of Tesla Class");
    }
    // @Override
    static void stop(){
        System.out.println("Generates electric when stopping");
    }
}
