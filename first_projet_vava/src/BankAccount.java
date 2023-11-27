public class BankAccount {

    private double balance;
    public static void deposit(double amount) throws InvalidAmountException {
        if(amount<=0)
            //throw new IllegalArgumentException();
//            throw new IOException();
            throw new InvalidAmountException();
        balance += amount;

    }

}
