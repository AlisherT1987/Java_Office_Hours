package week14.morning.Task2;

public class RemoteWebDriver implements WebDriver,TakesScreenshot,JavascriptExecutor{
    @Override
    public void executeScript() {

    }

    @Override
    public void getScreenshotAs() {

    }

    @Override
    public void get(String url) {

    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    public void getRemoteBrowser(String url){
        System.out.println("Connecting a cloud virtual machine to execute test scripts");
    }
}
