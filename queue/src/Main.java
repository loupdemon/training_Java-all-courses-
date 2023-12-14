import java.util.ArrayDeque;
import java.util.Queue;





public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        System.out.println("ajout 1 et 2");
        System.out.println(queue);
        queue.add(3);
        queue.add(4);
        System.out.println("ajout 3 et 4");
        System.out.println(queue);;
        //1 2 3 4

        System.out.println("on fait appel à remove queu");
        //suppression du premier element, si liste vide envoie exception
        queue.remove();
        System.out.println(queue);
        //2 3 4
        System.out.println("on fait affichage de queu.remove()");
        //suppression du premier element et l'afficher en meme temps
        System.out.println(queue.remove());
        //2

        System.out.println("on fait affichage de queu.peek()");
        //afficher le premier element et si liste vide envoie null
        System.out.println(queue.peek());
        //3

        System.out.println("on fait affichage de queu.poll()");
        //suppression du premier element et l'afficher en meme temps, envoie pas exception si liste pas null
        System.out.println(queue.poll());
        //3

        System.out.println(queue);
        //4 5

        System.out.println("on fait affichage de queu.element()");
        //afficher le premier element et si liste vide envoie exception
        System.out.println(queue.element());
        //4

        System.out.println(queue);
        //[4]

        //ajout d'un element
        System.out.println(queue.offer(6));
        //true
    }
}


