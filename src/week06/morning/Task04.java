package week06.morning;

public class Task04 {
    public static void main(String[] args) {
        System.out.println(diff21(13)); // 8
        System.out.println(diff21(23)); // 4
        System.out.println(diff21(-23)); // 44
        System.out.println(diff21(11.0)); // 44

     //   String str = "java";   What are the overloaded methods of String class ?


       // System.out.println(diff21("23"));  compiler error
    }

    public static int diff21(int num){
        int result = 0;
// logic here
        if(num <= 21){
            result = 21 - num;
        }else{
            result = (num-21) * (num-21);
        }
        return result;
    }

    public static double diff21(double num){         // complaining you have a method with name diff21(int)
        double result = 0;
// logic here
        if(num <= 21){
            result = 21 - num;
        }else{
            result = (num-21) * (num-21);
        }
        return result;
    }

}
