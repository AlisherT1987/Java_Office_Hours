package week07.morning;

public class GasTank {
    //attributes
    public double amount;
    public double capacity;

    public void setInfo(double amount, double capacity){
        if(amount > capacity ){
            this.capacity = capacity;
            this.amount = capacity;
          //  return;  // if we ever go into if statement the method execution should stop....
        }else {
            this.amount = amount;
            this.capacity = capacity;
        }
    }
    public void addGas(double fill){
//        if(amount+fill>capacity){
//            amount = capacity;
//        }else {
//            amount+=fill;
//        }
        amount+=fill;
        if(amount>capacity){
            amount=capacity;
        }
    }

    public void useGas(double spend){
        amount-=spend;
        if(amount<0){
            amount = 0;
        }
    }

    public boolean isEmpty(){
        return (amount < 0.1);
    }

    public boolean isFull(){
        return (amount > capacity-0.1);
    }

    public double getGasLevel(){
        return this.amount;  // using this keyword here is optional
    }

    public double fillUp(){
        double amountBeforeFillUp = this.amount;
        this.amount = this.capacity;
        return capacity-amountBeforeFillUp;
    }

}
