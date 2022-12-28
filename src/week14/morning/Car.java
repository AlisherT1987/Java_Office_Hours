package week14.morning;

public abstract class Car {
    private String color, model, make;
    private int year;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
// This class has
    public String getModel() {
    return model;
}

    public String getMake() {
        return make;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    abstract void drive();

    static void stop(){
        System.out.println("Stops the CAR");
    }

    static void oneCopyMethod(){
        System.out.println("Same for all super and sub classes");
    }
}
