package week14.evening.task2;

public interface WebDriver {

    void get(String url);

    void close();

    void quit();

    String getCurrentUrl();



}
