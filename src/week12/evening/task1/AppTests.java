package week12.evening.task1;

public class AppTests {
    public static void main(String[] args) {
        Instagram instagram=new Instagram(5.6);
        System.out.println(instagram);
        instagram.download();
        System.out.println("======================");
        Discord discord=new Discord(7.6);
        System.out.println(discord);

        discord.download();
    }
}
