public class BankAccount {

    private double balance;
    public static void deposit(double amount) throws BankAccountException {
        if(amount<=0) {
            //throw new IllegalArgumentException();
            //throw new IOException();
/*
//            BankAccountException bankAccountException = new BankAccountException();
//            InvalidAmountException invalidAmountException = new InvalidAmountException();
//            bankAccountException.initCause(invalidAmountException);
//
//            throw bankAccountException;*/

            throw new BankAccountException(new InvalidAmountException());
        }
        balance += amount;

    }


}
