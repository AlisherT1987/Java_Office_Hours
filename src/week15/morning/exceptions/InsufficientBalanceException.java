package week15.morning.exceptions;

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){

    }

    public InsufficientBalanceException(String message){
        super(message);
    }

    public static void main(String[] args) {

            double balance = 430.50;
            double itemPrice = 745.30;

            if(itemPrice>balance){
                throw new InsufficientBalanceException("Transaction declined due to insufficient balance");
            }



    }

}
