package week07.morning;

public class MyCalculator2 {
   public int n1,n2;  // these instance variables will be used inside our ins. methods

    public void setInfo(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }

    public int add(){
        return n1+n2;
    }
    public int subtract(){
        if(n1>=n2) {
            return n1 - n2;
        }else{
            return n2-n1;
        }
    }
    public int multiply(){
        return n1*n2;
    }
    public int divide(){
        return n1/n2;
    }
}
