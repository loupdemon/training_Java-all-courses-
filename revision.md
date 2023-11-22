
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

######
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








