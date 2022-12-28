package week14.morning.Task2;

public class FirefoxDriver extends RemoteWebDriver{
    @Override
    public void executeScript() {
        System.out.println("executes script on Firefox browser");
    }

    @Override
    public void getScreenshotAs() {
        System.out.println("takes screenshot of Firefox Browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Opening "+url+" with Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing the current opened Url with Firefox");
    }

    @Override
    public void quit() {
        System.out.println("Quiting all opened Firefox browsers");
    }

    @Override
    public String getCurrentUrl() {
        return "current URL from Firefox Browser";
    }

    public void specificActionOfFirefox(){
        System.out.println("specific action from Firefox");
    }
}
