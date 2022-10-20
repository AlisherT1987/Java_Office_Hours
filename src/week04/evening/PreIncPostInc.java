package week04.evening;

public class PreIncPostInc {

    public static void main(String[] args) {

        int a=5; //inside a we have 5
        int b= ++a;// first increment and then do your job //b is 6
           b=6;
        System.out.println(b++); //first do yuor job which is print 6
        b=7;
       //7                //8
        System.out.println(++b); //immediately increment do your action
        System.out.println(b);//8



    }
}
