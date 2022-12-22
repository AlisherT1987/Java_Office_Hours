package week13.morning.abstraction;

public class FreeWeight extends Lifting{

    public FreeWeight(double weight) {
        super(weight);
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*50;
    }

    @Override
    public void perform() {
        System.out.println("Performing Free E Weight Lifting");
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
