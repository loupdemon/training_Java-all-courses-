## Les exceptions
fait faire attentio aux exception qu'on cre: null + null crée un NullpointerException
le stacktrace, l'ordre d'exécussion des instruction dans l'inverse 
un bon developpeur se doit envisager les exception 
### les types exceptions:
#### checked : tout bon dev doit anticiper, ex; app doit acceder un fichier, il doit verifier si le fichier existe, si existe pas doit afficher un msg error au lieux qu'il crache,
#### unchecked (run time exceptions): elles declanchent lors des erreurs de programmation et mauvaises pratiques, pour y remedier faut faire des tests automatisés ... on trouve (nullpointerexception, arithmetiqueexception; operation mathematique comme division sur zerro, illegalArgumentsexception ; un argument non acceptable par methode bien precise, indexOutOfBoundException ex:acceder a un index 9 d'un tabl alors que aille inferieur de 9)
#### errors: erreur du par app, out of memory: pas assez de memoire ram, stack over flow si boucle infini...


### Hierarchie des exceptions:
la classe throwable: toute erreurouexception java doit s'etendre à cette classe là, le able est dédié à l'interface d'habitude.
les erreurs externes dans class error (comme stackover flow error)
la classe exception represente toute exception de java comme checked
Runtimeexption represente les unchaked , erreur programmations


#### pour lecture de fichier, on utilise java.io.FileReader 
apres lecture tjrs fermeture de fichier
pour gerer l'exception, on rajoute FIleNotFoundException 
Pour gerer l'erreur on met surounder try/catch qui seront proposé automatiquement ou on le fait , puis on gere message d'erreur avec l'instruction e.printStackTrace ou Throw new RuntimeException(e)


même pour lecture il faut ettre des exceptions.
Bien respecter l'ordre des exceptions, qui ne peuvent se faire que dans certaines chronologies des evenements, exemple lecture ne peut se faire qu'apres avoir été trouvé


MAis après il faut regarder quelle exception étend l'autre, celle qui étaend n'englobe pas le tout
exemple java.io.IOException viant avant FileNotFoundException

les exception peuvent être geré dans meme bloc pour certaines

#### try with ressources, permet de gerer differents ressources dans condition try. sans pour autant utiliser finaly 

#### lancement des exception à bien gerer
#### details des sg retours, sont simulé dans le comportememnt de l'app dans les loggins

La classe mère de toute erreur et exception en Java est Throwable

lors que les erreurs sont unchecked et on veut les gerer, il faut que celels ci s'etends vers RunTimeuException

le blc finaly est tjrs exécuté meme si l'exeption est lancé
-----------------------------------------------------------------------------------
-------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------


## Généricité
pour les tableau si on on ne specifie pas le type et on utilise de sobjets, notre lsite va devenir permessive et acceptera tout, meme des methodes,ce qu iest deconseillée:
exemple ! : (on serait après dans l'obligation a jouer avec des conversion et tout,ce qui n'est pas très desirée)  
List myList = new List();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add("45");
        myList.add(new BankAccount());
        myList.add(new BankAccountList());
        
on peut forcer le type grace à la generecité sanspasser par conversion :

public class GenericList <T>{
    //T is a type parameter
    //E is elemnt

    private T[] items = (T[]) new Object[5]; // taleau d'entier
    
    private int count; // nombre d'éléments dans le tableau
}
public void add(T item) {
	items[count++] = item;
}
 public T get(int index) {
        return items[index];
    }

le generriclist dans mon cas ne peut aps prendre des types primitifs mais seuleetn des objets
donc si ona envie d emettre des int , on ne doit pas ecrire 
GenericList<int> fourthList = new GenericList<>();
mais plutôt 
GenericList<Integer> fourthList = new GenericList<>();
aussi pour Double, Boolean, ....
ce systeme  oco fait appel au Boxing, qui permet d'envelopper un type primitif par sa réference
exemple  fourthList.add(2);

### number regroupe tous les Float, Integrer, Long, Short, Double...
### comparable permet de faire appel qu'aux objets qu'on peut comparer entre eux.
si on veut comparer BankAccount comme dans l'exemple faudrait implementer 
public class BankAccount implements Comparable<BankAccount> 



/////////////////////////////////////////////////
interface comparable 
        //return balance < other.balance ? -1 : balance == other.balance ? 0 : 1;
        
        //meme chose que :
        return (int)(balance - other.balance);   //balance est un double
        
        //meme chose que :
//if (this.balance == other.balance)
//            return 0;
//
//        if (this.balance < other.balance)
//            return -1;
//
//        return 1;

/////////////////////////////////////////////////////
une autre façon d'utiliser les méthode generique pour des classes non generiques comme des objets avec comprable 
à regarder  l'exemple dans utils minOj et avec tostring pour backAccount 1 et 2 
////////////////////////////////////////////////////

  

