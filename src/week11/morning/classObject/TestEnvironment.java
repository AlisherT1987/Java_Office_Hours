package week11.morning.classObject;

public class TestEnvironment {  // Has-A relationship with Browser and OS class

    Browser browser;
    OS os;

    public TestEnvironment() {
    }

    public TestEnvironment(Browser browser, OS os) {
        this.browser = browser;
        this.os = os;
    }

    @Override
    public String toString() {
        return "TestEnvironment{" +
                "browser=" + browser +
                ", os=" + os +
                '}';
    }
}
