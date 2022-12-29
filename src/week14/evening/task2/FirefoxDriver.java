package week14.evening.task2;

public class FirefoxDriver extends RemoteWebDriver{

    @Override
    public void get(String url) {

        System.out.println("We are opening the firefox with " +url);
    }

    @Override
    public void close() {
        System.out.println("Close the firefox window");

    }

    @Override
    public void quit() {

        System.out.println("Close te firefox");
    }

}
