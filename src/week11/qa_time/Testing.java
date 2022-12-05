package week11.qa_time;

public class Testing {
    public static void main(String[] args) {

        ChromeBrowser browserOne = new ChromeBrowser();

        browserOne.name = "Chrome Browser";
        browserOne.version = "107.5304.123";

        browserOne.open();



        char c = '5';

        System.out.println("Character.isDigit(c) = " + Character.isDigit(c));

    }
}
