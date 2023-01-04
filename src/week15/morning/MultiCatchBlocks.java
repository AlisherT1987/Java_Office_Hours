package week15.morning;

public class MultiCatchBlocks {
    /*
    When we are using multi catch blocks we need to go from more specific to less
     */
    public static void main(String[] args) {
        String sentence = "B28 Office Hours Morning";
      //  sentence = null;
        try {
            System.out.println(sentence.substring(25));
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
           // return;   // finally block gets executed
            System.exit(0);  // finally block did not get executed
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Throwable t){
            System.out.println(t.getMessage());
        }
        finally {
            System.out.println("Closing Database connection");
        }



    }
}
