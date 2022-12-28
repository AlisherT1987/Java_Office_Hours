package week14.morning.Task2;

import java.sql.Driver;

public class TestDriver {
    /*
    You want to test an application with all the Browser types in the market
    * Do we have to create different tests for all of them?
    DRY : Don't Repeat Yourself
    We create our Driver Object in a polymorphic way, so each time we call methods of different browsers
     */

    public static void main(String[] args) {

        RemoteWebDriver driver = new ChromeDriver();
        // I am executing following test with Chrome
       executeTests(driver);

        // I want to continue our testing with same object reference
        driver = new FirefoxDriver();
      executeTests(driver);
      driver.getRemoteBrowser("www.cydeo.com");
        ((FirefoxDriver)driver).specificActionOfFirefox(); // downcasting
      driver.someMethod();

    }

    public static void executeTests(RemoteWebDriver driver){
        driver.get("www.cydeo.com");
        driver.getCurrentUrl();
        driver.getScreenshotAs();
        driver.close();

    }


}
