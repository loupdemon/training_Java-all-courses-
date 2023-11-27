public class BankAccount implements Comparable <BankAccount> {
    private int id;
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount other) {
        //this < other => -1
        //this == other => 0
        //this > other => 1
        //veut dire que si le solde de this est inférieur au solde de other, on retourne -1 :

        //return balance < other.balance ? -1 : balance == other.balance ? 0 : 1;

        //meme chose que :
        return (int)(balance - other.balance);   //balance est un double et le int convertie le resultat en 1 ou -1 ou 0

        //meme chose que :
//        if (this.balance == other.balance)
//            return 0;
//
//        if (this.balance < other.balance)
//            return -1;
//
//        return 1;
    }
}

//////////////////////////////////////
//public class BankAccount implements Comparable<BankAccount> {
//    private int id;
//    private int balance;
//
//    public BankAccount() {
//    }
//
//    public BankAccount(int id, int balance) {
//        this.id = id;
//        this.balance = balance;
//    }
//
//    @Override
//    public int compareTo(BankAccount other) {
//        //this < other => -1
//        //this == other => 0
//        //this > other => 1
//        if (this.balance == other.balance)
//            return 0;
//
//        if (this.balance < other.balance)
//            return -1;
//
//        return 1;
//    }
//}

/////////////////////////////////////////////////////

//public class BankAccount {
//    private int number;
//    private int balance;
//
//    public BankAccount() {
//    }
//
//    public BankAccount(int number, int balance) {
//        this.number = number;
//        this.balance = balance;
//    }
//}
