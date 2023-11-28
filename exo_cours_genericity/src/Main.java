import javax.swing.plaf.basic.BasicGraphicsUtils;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List myList = new List();
        myList.add("ok");
        myList.add(2);
        myList.add(3);
        myList.add("45");


//        int x = (int) myList.get(0);
//
//        System.out.println(myList.get(0));

        var secondeList = new GenericList<String>();
        //seocondeList.add( reconait attends une chaine d ecaractere car lors de creation seconde liste, on lui a mis type String pour l'objet.
        secondeList.add("ok");
        secondeList.add("2");
        secondeList.add("3");
        secondeList.add("45");


        String y = secondeList.get(0);
        System.out.println(y);


        var thirdList = new GenericList<BankAccount>();
        //thirdList.add(new BankAccount(1, 100)); error
        thirdList.add(new BankAccount(1, 100));
        BankAccount bankAccount = thirdList.get(0);

        GenericList<Integer> fourthList = new GenericList<>();
        fourthList.add(1); //boxing
        fourthList.add(2);
        int x = fourthList.get(0); //unboxing
        //la généricité permet de ne pas avoir à caster
        //concerne que els réferences


//////////////////////////////////////////////////////

        new GenericListnumber<Float>();
        new GenericListnumber<Double>();
        new GenericListnumber<Integer>();
        new GenericListnumber<Byte>();
        new GenericListnumber<Short>();
        new GenericListnumber<Long>();


        new GenericListComparable<Integer>();
        new GenericListComparable<Float>();
        new GenericListComparable<BankAccount>();


    // new GenericListComparableClonable<BankAccount>();


        BankAccount bankAccount1 = new BankAccount(15);
        BankAccount bankAccount2 = new BankAccount(30);

        if (bankAccount1.compareTo(bankAccount2) < 0) {
            System.out.println("bankAccount1 < bankAccount2");
        }

        if (bankAccount1.compareTo(bankAccount2) > 0) {
            System.out.println("bankAccount1 > bankAccount2");
        }

        System.out.println(Utils.min(1, 2));

        System.out.println(Utils.minObj(5.2, 6.3));

        System.out.println(Utils.minObj("kx", "ko"));

        System.out.println(Utils.minObj(bankAccount1, bankAccount2));

        Utils.printKeyValue(1, "ok");

        Utils.printKeyValueObject(1, "ok");


        BankAccount b1 =new BankAccount(100);
        //on peut instancier Saving Account, car elle hérite de BankAccount
        BankAccount b2 =new SavingAccount( 5);
        Utils.printBankAccount(b1);
        Utils.printBankAccount(new SavingAccount(50));
        Utils.printBankAccounts(new GenericList<BankAccount>());

        //par contre meme si SavingAccount hérite de BankAccount, on ne peut pas instancier SavingAccount
        //ca sera faut d'ecrire
        //Utils.printBankAccounts(new GenericList<SavingAccount>());

        //pour y remedier on peut utiliser les wildcard
        Utils.printBankAccountsWildCard(new GenericList<BankAccount>());
        Utils.printBankAccountsWildCard(new GenericList<SavingAccount>());

        //pour restreind lower bounded wildcard
        Utils.printBankAccountsWildCardLowerBounded(new GenericList<BankAccount>());
        //on ne peut du coup rajouter SavingAccount car elle hérite de BankAccount
        //Utils.printBankAccountsWildCardLowerBounded(new GenericList<SavingAccount>()); //error

    }
}