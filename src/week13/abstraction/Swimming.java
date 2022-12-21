package week13.abstraction;

public class Swimming extends Exercise{// first concrete class has to implement abstract methods

    public Swimming(double weight) {
        super(weight);
    }


    @Override
    public int getCalories(int minutes) {
        return minutes*30;
    }

    @Override
    public void perform() {
        System.out.println("Swimming in the pool");
    }


}
