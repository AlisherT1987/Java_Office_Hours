package week11.morning.classObject;

public class TestCases {

    public static void main(String[] args) {

        TestEnvironment test1 = new TestEnvironment();
        System.out.println(test1);
        test1.browser = new Browser("Chrome");
        test1.os = new OS("Windows");
        System.out.println(test1);


    }
}
