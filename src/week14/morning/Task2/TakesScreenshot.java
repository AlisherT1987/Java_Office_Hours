package week14.morning.Task2;

public interface TakesScreenshot {
    void getScreenshotAs();
    default void someMethod(){
        System.out.println("from Takescreenshot Interface");
    }
}
