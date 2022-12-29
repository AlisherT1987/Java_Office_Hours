package week14.evening.task2;

public class ChromeDriver extends RemoteWebDriver{
    @Override
    public String getScreenshotAs() {
        return "JPEG";
    }

    @Override
    public void get(String url) {

        System.out.println("We are opening the chrome browser with " +url);
    }

    @Override
    public void close() {
        System.out.println("Close the chrome window");

    }

    @Override
    public void quit() {

        System.out.println("Close te chrome");
    }


}
