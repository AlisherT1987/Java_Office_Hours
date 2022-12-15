package week12.evening.task2;

public class TestComputers {

    public static void main(String[] args) {

        Mac mac = new Mac(512);
        System.out.println(mac);
        mac.info();

        Asus asus=new Asus(128);
        System.out.println(asus);
        asus.info();
    }
}
