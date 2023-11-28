public class Utils  {
    public static int min(int a, int b) {
        return (a < b) ? a : b; // si a < b alors return a sinon return b
    }
    public static <T extends Comparable<T>> T minObj(T c, T d) {
        return (c.compareTo(d) < 0) ? c : d; // si a < b alors return a sinon return b
    }


    public static void printKeyValue(int key, String value) {
        System.out.printf("key is %d, value is %s%n", key, value);
    }

    //lorsque on manipule deux type generique , on oublie le T et onr ecours à K et V
    public static <K, V> void printKeyValueObject(K key, V value) {
        System.out.printf("key is %s, value is %s%n", key, value);
    }

    public static void printBankAccount(BankAccount bankAccount) {
        System.out.println(bankAccount);
    }


    //aficher une liste de bankAccounts
    public static void printBankAccounts(GenericList<BankAccount> bankAccounts) {
//        for (int i = 0; i < bankAccounts.getCount(); i++) {
//            System.out.println(bankAccounts.get(i));
//        }
    }

    //WildCard
    //le point d'interrogation ? veut dire qu'on peut passer n'importe quel type
    //la liste generique peut être de tout type
    //la solution est très permissive
    //pour la restreindre on utilise extends BankAccount dans notre cas
    ///ça veut dre elle doit accepter que les classe de BankAccount et celles qui heritent de bankAccount comme SavingAccount
    //le Upper Bounded Wildcard (on limite la classe ere de l'extension), n accepte toutes les classes qui etendront les classes herités

    public static void printBankAccountsWildCard(GenericList<? extends BankAccount> bankAccounts) {
//        i = 0; i < bankAccounts.getCount(); i++) {
//            System.out.println(bankAccounts.get(i));    for (int
//        }
    }

    //pour Lower Bounded Wildcard et restreindre au lieu d'étendre
    //on utilise super au lieu de extends
    public static void printBankAccountsWildCardLowerBounded(GenericList<? super BankAccount> bankAccounts) {
//        i = 0; i < bankAccounts.getCount(); i++) {
    }
}
