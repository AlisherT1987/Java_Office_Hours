package week14.evening.task2;

public class SafariDriver extends RemoteWebDriver{

    @Override
    public String getScreenshotAs() {

        return "TIFF";
    }

    @Override
    public void get(String url) {

        System.out.println("We are opening the safari with " +url);
    }

    @Override
    public void quit() {

        System.out.println("Close te safari");
    }
}
