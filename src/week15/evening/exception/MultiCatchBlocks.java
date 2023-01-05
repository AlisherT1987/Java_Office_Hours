package week15.evening.exception;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        try {
            for (int i = 6; i >=0; i--) {
                System.out.println(120 / i);
            }

            int [] numbers={1,2,3};

            System.out.println(numbers[3]);

            String name="ADam";

            System.out.println(name.charAt(4));

        }

        /* catch (Exception e){
            WE CAN NOT USE PARENT AT TOP
        }
        */


        catch (ArithmeticException e) {
            System.out.println("You have the ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you have the ArrayIndexOutOfBoundsException");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("you have the StringIndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("you have the Exception");
        }


    }
}
