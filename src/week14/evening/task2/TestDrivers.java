package week14.evening.task2;

public class TestDrivers {
    public static void main(String[] args) {
        // parent class or interface referenceName=new ClasName();
        WebDriver driver = new ChromeDriver();
        driver.get("youtube.com");
        System.out.println("===================");
        driver = new FirefoxDriver();
        driver.get("youtube.com");

        driver.quit();

        System.out.println("===============");
        driver = new ChromeDriver();
        driver.quit();
        System.out.println(((TakeScreenshot) driver).getScreenshotAs());

        TakeScreenshot driver2 = new ChromeDriver(); //we define our scope is TakeScreenshot methods

        System.out.println(driver2.getScreenshotAs());
        //I want to reach WebDriver methods
        //We need to change our scope
        ((WebDriver) driver2).get("youtube.com");

        //I want to executeScript
        //We need to change our scope in order to reach method inside the JavaScripExecuter

        ((JavascriptExecutor)driver2).executeScript("Adam");

    }
}
