package week13.abstraction;

public abstract class Exercise {

    // abstract String name; abstraction has nothing to do with Variables
    double weight;

    public Exercise(double weight) {
        this.weight = weight;
    }

    public void start(){
        System.out.println("Starting Exercise");
    }
    public abstract int getCalories(int minutes);

    public abstract void perform();

    public static void main(String[] args) {
      //   Exercise exercise = new Exercise();  abstract classes CANNOT be instantiated
    }

}
