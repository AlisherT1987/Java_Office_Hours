package week10.evening.statics;

public class TestEating {

    public static void main(String[] args) {
        //168
        EatCake Sergie=new EatCake();
        Sergie.eatCake(10);
        System.out.println(Sergie.totalSliceOfCake); // 158

        EatCake Adam=new EatCake();
        Adam.eatCake(10);
        System.out.println(Adam.totalSliceOfCake); //148



    }
}
