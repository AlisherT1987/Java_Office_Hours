package week07.evening;

public class GasTank {

    /*

Task-4
Write a class named GasTank containing:
An instance variable named "amount" of type double.
An instance variable named "capacity" of type double.
A setInfo method that sets values for these attributes.
A method named addGas that accepts a parameter of type double. The value of the amount instance variable is increased by the value of the parameter. However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
A method named useGas that accepts a parameter of type double. The value of the amount instance variable is decreased by the value of the parameter. However, if the value of amount is decreased below 0, amount is set to 0.
A method named isEmpty that accepts no parameters. isEmpty returns a boolean value: true if the value of amount is less than 0.1, and false otherwise.
A method named isFull that accepts no parameters. isFull returns a boolean value: true if the value of amount is greater than capacity-0.1, and false otherwise.
A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.
A method named fillUp that accepts no parameters. fillUp increases amount to capacity and returns the difference between the value of capacity and the original value of amount (that is, the amount of gas that is needed to fill the tank to capacity).
     */
    public double amount;
    public double capacity; // 50 gallon

    public void setInfo(double amount, double capacity) {
        this.amount = amount;
        this.capacity = capacity;
    }

    public double fillUp(){
        double neededGas=capacity-amount;
        amount=capacity;
        return neededGas;
    }

    public double getGasLevel(){
        return amount;
    }

    public boolean isFull(){
        /*
        if (amount>(capacity-0.1))
            return true;
        else
            return false;

         */


        return amount>(capacity-0.1);
    }

    public boolean isEmpty(){
       /* if (amount<0.1)
            return true;
            else
                return false;

        */
        //return amount<0.1;
      return   amount<0.1?true:false;
    }


    public void useGas(double amountOfUsage){
        if (amount-amountOfUsage<=0){
            amount=0;
        }else {
            amount-=amountOfUsage;
        }
    }

    public void addGas(double amountOfGas){
       if (amount+amountOfGas<=capacity){
           amount+=amountOfGas;
       }else {
           amount=capacity;
       }

    }



    public String toString() {
        return "GasTank{" +
                "amount=" + amount +
                ", capacity=" + capacity +
                '}';
    }
}
