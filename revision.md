
## Les variables 
on stoque mémoire ou valeur, ...
typeDonnée nomVariable

### type de donnée

pour nombre entier: Primitifs = byte short int long
#### primitifs 
pour nombre flottantes : float , double 
pour booléen : Boolean exemple true /false
pour charactère unique: char (un seul caractere ou caractere ASCII)

--------
exemple : 
prix vehicule en int car 35,5 euro sera plus 35500 et ça peut aller à des milliars
nombre de place vehicule: plus long nombre 8 donc on utilise un byte
puissance 350 à 400 kw si bugatti max donc un short suffirait 
pour état :  Neuf ou pane ou Occasion: on peut utiliser variable char  N ou P ou O
consommation 15.5 7.1 ...on mettre un float
endommage ou pas: on mettra un booléen ; si oui il apparait si non il apparait pas
--------


#### different type d'objets
un objet peut avoir plusierus état et type de comportement ce que les primitifs n'ont pas 
nombre entier : pareil que int juste commence par majuscule: Byte, Short, Integer, Long
nombre flottante: Float, Double
booleén: Boolean
caractere: Character au de chat dans variable primitif, String (peut stoquer une quantité illimité d etexte ...)
type d'objet personalisé et intégré: FileWriter (fichier personalisé ou modifier un sysetem), BlueWhale (exemple nom d'un objet  personalisé dans le jeux), ATMMachine (pour system bancaire)

##### Les convention de l'appelation
sensible à la casse exemple: int nombreDeFolower =/= int NOMBREDeFollowers
ne peut pas être déclaré deux fois avec le même nom dans la même classe ou même methode
doit commencer par une lettre ou $ ou _(nom recommandé)
peut egalement contenir un chiffre
ne peut pas être egal au mot clé de java comme abstract ou catch ou double ..... bien d'autres.

##### convention de nommage 
camelCase 
décrire complètement ce que contient la variable 
ne pas utiliser d'abréviation lorsque c'est possible 
ne pas réutiliser la variable à d'autres fin
ne pas utiliser de $ ou de 8 ou de chiffre dans les noms de variable 


##### conversion type données primitifs
conversion explicité 
typeDonnéeSouhaite nomNouvelleVar = (typeDonnéeSouhaite) val ou autreNomVar
il y a elargissement plus mieux que le retricisement qui peut causer perte de donné


##### Réferences d'objets
objet = une instance d'une classe (stoqué quelque part dans la mémoire)
référence = pointe vers un emplacement mémoire

Quand on crée un objet, on peut rajouter de la valeur à tout ces atribut, on peut creer un nombre illimité dans une classe

###### objets
commment creer un objet
NomClass NomVariable = valeur Ou new NomClass();
---------
exemple stylot bleu et stylo nnoir et stylot rouge
Stylo qui est notre nom de classe
variable CouleurStylot
Stylot CouleurStylotNoire = new Stylot("noir")
Stylot CouleurStylotBleu = (new Stylot ("bleu")
----------------
Ce qui les differencie des variables primitifs
on utilise println pour afficher
pour appeler les fonction dans les fonctions StylotCouleurBleu.recharger()
StylotCouelurNoir.jetter()
StylotCouleurBleu.getDescription()
---------------------------
fonctions pour des chaines caracteres 
toUpperCase(à passe miniscule au majuscule pour des characteres 
toLowerCase() pour l(invers 
equals() = pour comparer deux chaine caractere
isEmpty() pour voir si c'est vide

String typeStylot = "StylotCouelurBleu";
isBlank() = 

##### Operateur
###### Arithmetique +,%,/,-%,-,*,=,+= ( x+y),-= (x-y),*= (x*y)...
###### logique ==, ||, !=
###### relationnel : <,>,<=,>=;!=,==
######unaire : ++, -+, --deconcatener,++ cancatener
######logique && (and) , || (or)


#### Boucles : repetition d'une instruction 
-------------
while (condition){}
--------------
int i= 1;
while(i<1000){
System.out.println("hello");
i++;}

--------------------
do{...}while(condition);
-------------------
int i=1;
do{System.out.println("hello");i++;]while(i<100);

while fait dab verification de condition avant d'entamer le code
do while execute dab le code sans verification puis pourboucler il faut que la condition soit correcte pour repasser a nouveau 
-------------------
for (initialisation; condition; instruction mise a jour){}
-------------------
continue permet de sauter des étapes dans les boucles (ligne qui suit

for(int i=1;i<=100;i++){
   if(i==10){
          continue;}
          System.out.println("ne pas m'affiche au 10")
         }
  }
          
le continue va sauter l'exécussion quand condition i==10 est validée
--------------------------
beak: sert a arreter la boucle, sort completement de boucle
for(int i =1; i>=100;i++){
	if(i==10){break;}
	System.out.println("je ne parle pas");
--------------------------------------------------------
#### Flux de controle
il permet au program prendre des decision, pour savoir quel code exécuter


exemple: if(noteFilm>5 &&(categoryFilm.equals("action") || categoryFilm.equals('comedie")){
		Systeme.out.println("je le regarderai ce soir");
	}
	
--------------------------------------------
if(condition){}elseif(condition)
else{}


--------------------------
Switch(valeur){
	case val1:
		....
		break;
	case val2:
		...
		break;
	default:
		 ....
	 }
-------------------------
### Méthode
la methode et la fonction: un bloc de code qui ne s'execute que lorsqu'ielles sont appelées.

comment definir une méthode: 
typeDeRetour doit être meme chose comme dans c void, int, char,...
typeDeRetour nomFonction(){
	...
	return typeDeRetour;
}


void direBonjour(){
	system.our.println("Bonjour");
}

public static void main(String[] args){}
modificateuracces static(montre qu'elle appartient à la class) void(renvoi pas valeur) nomFonction(parametre)

public double getReductionDixPourCetPrixAchat(int prix){return prix *0.9;
}

appel de fonction: nomdefonction(valeur parametre)
-------------------------

difference entre argument et parament:
qand un paramtre est passer à une méthode on l'appele argument :
exemple public double getReduction(int prix) là c'est un parametre
getReduction(2000) là c'est un argument
---------------

### lecture entrée utilisateur:
int userInput = scanner.nextInt();  // Utilisez nextInt() pour lire un entier
string Input = scanner.nextline()//Utilisez nextline()pour lire une ligne
scanner.next pour lire une chaine de caractere


----------------------------------

#### programme switchapp à trouver dans le github est un bon exercice pour les boucles et java.util.map

Le LinkedHashMap et le HashMap implémentent tous deux l’interface Map. Cependant, il existe quelques différences entre elles.

LinkedHashMap utilise une liste doublement chaînée en interne. De ce fait, elle conserve l’ordre d’insertion de ses éléments.
La classe LinkedHashMap nécessite plus de stockage que HashMap. Cela est dû au fait que LinkedHashMap maintient des listes chaînées en interne.
Les performances de LinkedHashMap sont plus faibles que celles du HashMap.

###### le garbage collector
lorsque la clé du weakhashmap est définie comme nulle et que l’on effectue un garbage collection, la clé est supprimée. C’est parce que, contrairement aux hashmaps, les clés des weakhashmaps sont de type référence faible. Cela signifie que les entrées d’une weakhashmap sont supprimées par le ramasse-miettes (garbage collector) si la clé de cette entrée n’est plus utilisée. Ceci est utile pour économiser des ressources.

---------------------------------------------------------------
#### TreeMap
La classe TreeMap est une Map qui stocke des éléments de manière triée dans un une structure arborescente. Elle implémente l’interface SortedMap sur lequel nous reviendrons plus tard dans le tutoriel.

Les éléments de la collection TreeMap sont triés selon l’ordre naturel de leur clé (s’ils implémentent l’interface Comparable) ou en utilisant une instance de type Comparator fournie au constructeur de la collection.
exemple donné :
voici un exemple explicite d'utilisation de TreeMap en Java. Dans cet exemple, nous allons créer une TreeMap pour stocker des noms de personnes associés à leur âge, et nous allons les trier par ordre alphabétique des noms.


##### TreeMap Comparator
Dans l’exemple ci-dessus, les éléments du Treemap sont triés naturellement (par ordre croissant). Cependant, il est possible de personnaliser l’ordre des clés. Pour cela, il faut créer votre propre classe de comparateur basée sur le tri des clés dans un treemap. 
-------------------------------------------------------------

##### NavigableMap et SubMap de SortedMap j'ai utilisé lastEntry et firstEntry pour recuperer les données de premier chaineau et dernier chaineau 
-------------------------------------------------------------
headMap(key, booleanValue) : la méthode headMap() renvoie toutes les entrées d’une NavigableMap associées à toutes les clés précédant la clé spécifiée (qui est passée en argument). La valeur booléenne (booleanValue) est un paramètre facultatif. Sa valeur par défaut est false.
tailMap(clé, booleanValue) : la méthode tailMap() renvoie toutes les entrées d’une NavigableMap associées à toutes les clés après la clé spécifiée (passée en argument), y compris l’entrée associée à la clé spécifiée. La valeur booléenne (booleanValue) est un paramètre facultatif. Sa valeur par défaut est true. Si false est passé comme booleanValue, la méthode renvoie toutes les entrées associées à ces clés après la clé spécifiée, sans inclure l’entrée associée à la clé spécifiée.
subMap(k1, bv1, k2, bv2) : la méthode subMap() renvoie toutes les entrées associées aux clés comprises entre k1 et k2, y compris l’entrée associée à k1. Les paramètres bv1 et bv2 sont facultatifs. La valeur par défaut de bv1 est true et la valeur par défaut de bv2 est false. Si false est passé comme bv1, la méthode retourne toutes les entrées associées aux clés entre k1 et k2, sans inclure l’entrée associée à k1. Si true est passé comme bv2, la méthode retourne toutes les entrées associées aux clés entre k1 et k2, y compris l’entrée associée à k1.






