package week14.morning.Task2;

public interface WebDriver {

    // methods without body
    void get(String url);
    void close();
    void quit();
    String getCurrentUrl(); // to test if you are at correct URL we use this method

}
