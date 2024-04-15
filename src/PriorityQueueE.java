import java.util.Iterator;
import java.util.PriorityQueue;


/// Proprity queue ... El de mayor valor tiene menos valides solo se impementa con arboles binarnio rs
// la estructutra bynerry HEAP solo para nodos con punteros
// Prioryty queue usa un array (areglos)
//Hijo de la izquierda es === a el dodle del indice del padre
// Hijo de la derecha ==== hijo de la izquierda +2
// Padre === (indice -1)/2



/// tenr en cuenta que se basa en los arboles  es decir se llena de izquiserd a derecha


public class PriorityQueueE {
    public static void main(String[] args) {

        // Declariacion de l clase priority Queue

        PriorityQueue<String>queue=new PriorityQueue<>();
        //Añadir (6.9.8,1,5,6,0,11,10,4)



        queue.add("C");
        queue.add("C++");
        queue.add("7");
        queue.add("Java");
        queue.add("Pyton");


        System.out.println("Los valores son     "+queue);
       System.out.println("Los eliminados    "+queue.poll());
       System.out.println("Los valores nuevos  "+queue);
       // System.out.println("swadawd   ");
              //elemeode de mayor prooridad

        System.out.println("Elemento d emayor prioridad es: "+queue.peek());
        Iterator<String> itr2= queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

        queue.remove("Java");
        System.out.println();
        System.out.println(queue);

        Iterator<String> itr3= queue.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

    }


}

