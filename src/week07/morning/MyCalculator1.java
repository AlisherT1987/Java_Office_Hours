package week07.morning;

public class MyCalculator1 {
    // no instance variables
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int subtract(int n1, int n2){
        if(n1>=n2) {
            return n1 - n2;
        }else{
            return n2-n1;
        }
    }
    public int multiply(int n1, int n2){
        return n1*n2;
    }
    public int divide(int n1, int n2){
        return n1/n2;
    }


}
