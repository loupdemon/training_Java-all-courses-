public class SavingAccount extends BankAccount{
    private double interestRate;

    //on crée un constructeur parametré SavingAccount
    ///il prend un seul paramettre double balance
    //on pose le balance come constructeur super
    public SavingAccount(double balance) {
        super(balance); //super(balance) est un constructeur de la classe parent BankAccount
    }

    public SavingAccount(int id, int balance, double interestRate) {
        super(id, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
