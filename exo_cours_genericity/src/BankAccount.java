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

    @Override
    //pour afficher le contenu de l'objet
    //on peut utiliser toString() pour afficher le contenu de l'objet
    //on peut utiliser equals() pour comparer le contenu de l'objet
    //on peut utiliser hashCode() pour comparer le contenu de l'objet
    //on peut utiliser compareTo() pour comparer le contenu de l'objet
    //on peut utiliser clone() pour cloner le contenu de l'objet
    //on peut utiliser finalize() pour finaliser le contenu de l'objet
    //on peut utiliser getClass() pour obtenir la classe de l'objet
    //on peut utiliser notify() pour notifier le contenu de l'objet
    //on peut utiliser notifyAll() pour notifier le contenu de l'objet
    //on peut utiliser wait() pour attendre le contenu de l'objet
    //on peut utiliser wait(long) pour attendre le contenu de l'objet
    //on peut utiliser wait(long, int) pour attendre le contenu de l'objet ...
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
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
