package week14.evening.task2;

public class RemoteWebDriver implements WebDriver,TakeScreenshot,JavascriptExecutor{
    @Override
    public void executeScript(String script) {
        System.out.println("Executing script which is " + script);
    }

    @Override
    public String getScreenshotAs() {

        return "PNG";
    }

    @Override
    public void get(String url) {

        System.out.println("We are opening the browser with " +url);
    }

    @Override
    public void close() {
        System.out.println("Close the window");

    }

    @Override
    public void quit() {

        System.out.println("Close te browser");
    }

    @Override
    public String getCurrentUrl() {
        return "https://www.google.com/";
    }
}
