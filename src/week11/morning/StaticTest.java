package week11.morning;

public class StaticTest {
    public static void main(String[] args) {

        StaticMethods.displaysMessage("B28 is doing great!");

        StaticMethods object = new StaticMethods();
        object.instanceMethod(10);

    }
}
