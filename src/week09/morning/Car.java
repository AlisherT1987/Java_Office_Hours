package week09.morning;

public class Car {

    public String make;
    public String model;
    public int year;
    public double price;
    public String color;

    public void setInfo(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }
    /*
    public Car(){   ----> Constructors: speacial methods
    }
     */


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
