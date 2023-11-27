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
pour gerer l'exception, on rajoute FIleNotFoundException 
Pour gerer l'erreur on met surounder try/catch qui seront proposé automatiquement ou on le fait , puis on gere message d'erreur avec l'instruction e.printStackTrace ou Throw new RuntimeException(e)



