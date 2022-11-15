package week07.qaTime;

public class QuizQs {

    public static void main(String[] args) {

        int z = 5;
        for (int i = 5; i > 0 ; i--) {
            z +=i;   // 5+5=10, 10+4=14, 17, 19, 20
        }
        System.out.println(z); // 20

        int j=7;
        for (int i = 0; i < j-1 ; i+=2) { // i=2,  water-aquarium  i is your fish
            System.out.println(i); // 0, 2, 4
        }
       // System.out.println(i); // fish is dead
        System.out.println(j);

        /*
        i = local variable, it's life time is inside within loop only
        j = global compared to i
         */
    }
}
