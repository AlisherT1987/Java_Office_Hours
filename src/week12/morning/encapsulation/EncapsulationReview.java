package week12.morning.encapsulation;

public class EncapsulationReview {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getBalance());

        bankAccount.setName("Watson");
        System.out.println(bankAccount.getName());

        bankAccount.setBalance(1000 + 10000);
        System.out.println(bankAccount.getBalance());

        System.out.println(bankAccount.toString());


    }
}
