package week14.morning.Task2;

public class ChromeDriver extends RemoteWebDriver{
    @Override
    public void executeScript() {
        System.out.println("executes script on Chrome browser");
    }

    @Override
    public void getScreenshotAs() {
        System.out.println("takes screenshot of Chrome Browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Opening "+url+" with Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing the current opened Url with Chrome");
    }

    @Override
    public void quit() {
        System.out.println("Quiting all opened Chrome browsers");
    }

    @Override
    public String getCurrentUrl() {
        return "current URL from Chrome Browser";
    }
}
