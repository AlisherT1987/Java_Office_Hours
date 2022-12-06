package week11.qa_time;

import java.time.LocalTime;

public class TimeTry {

    public static void main(String[] args) throws InterruptedException {


        System.out.println(LocalTime.now());

        while (LocalTime.now().isBefore(LocalTime.of(16,6,4))){
            Thread.sleep(1000);
        }

        System.out.println("Hello");
        System.out.println(LocalTime.now());

    }

}
