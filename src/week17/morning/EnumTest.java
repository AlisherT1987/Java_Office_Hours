package week17.morning;

public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day=day;
    }

    public void tellItLikeThis(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are busy");
                break;
            case FRIDAY:
                System.out.println("Friday is fries day go to McDonald");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Perfect weekend");
                break;

            default:
                System.out.println("rest does not matter");
                break;
        }
    }


    public static void main(String[] args) {

        EnumTest firstDay = new EnumTest(Day.MONDAY);

        firstDay.tellItLikeThis();

      /*  EnumTest testDay = new EnumTest(Day.OSCAR);
      I can not get out of predefined set of constants

      In UI Automation, we use Selenium Library: and inside this library we have "Keys ENUM" for some
      keyboard actions that we can send to the method...
       */

    }

}
