package week10.qaTime;

import java.time.LocalDate;

public class Testing {
    public static void main(String[] args) {

        Server server = new Server();  // calling the constructor
        server.name = "Oscar";

        Server server1 = new Server("Oscar",123, 15, true, LocalDate.of(2021,5,15));



    }
}
