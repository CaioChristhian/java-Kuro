package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
    public static void main(String[] args) {
        inserindoNaFila();
        removendoDaFila();
        acessandoDaFila();
    }

    private static void acessandoDaFila() {
        System.out.println("**** ACESSANDO *****");
        Deque<String> ad = new ArrayDeque<String>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<String>();
        d.add("Green");
        d.add("Orange");

        ad.addAll(d);

        System.out.println(ad);
        System.out.println(ad.contains("White"));
        System.out.println(d.contains("Brown"));
        System.out.println(d.containsAll(d));

        System.out.println("Output of element: " + ad.element());
        System.out.println("Get first element using getFirst: " + ad.getFirst());
        System.out.println("Get first element using getLast: " + ad.getLast());
        System.out.println("Output of peek: " + ad.peek());
        System.out.println("Get first element using peekFirst: " + ad.peekFirst());
        System.out.println("Get last element using peekLast: " + ad.peekLast());
        System.out.println();
    }

    private static void removendoDaFila() {
        System.out.println("**** REMOVENDO *****");
        Deque<String> ad = new ArrayDeque<String>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<String>();
        d.add("Green");
        d.add("Orange");
        d.add("Pink");
        d.add("Purple");
        d.add("Brown");

        ad.addAll(d);
        System.out.println("Elements in the ArrayDeque: " + ad);

        String val = ad.remove();
        ad.remove("Black");

        System.out.println("Elements in the ArrayDeque after remove: " + ad);

        ad.removeFirst();
        ad.removeLast();

        System.out.println("Elements in the ArrayDeque after removeFirst and RemoveLast: " + ad);

        ad.poll();
        ad.pollFirst();
        ad.pollLast();

        System.out.println("Elements in the ArrayDeque after pool, poolFirst, poolLast: " + ad);

        ad.pop();
        System.out.println("Elements in the ArrayDeque after pop: " + ad);

        ad.retainAll(d);
        System.out.println("Elements in the ArrayDeque retainiAll: " + ad);

        ad.removeAll(d);
        System.out.println("Elements in the ArrayDeque after removeAll: " + ad);
        System.out.println();
    }

    private static void inserindoNaFila() {
        System.out.println("**** INSERINDO *****");
        Deque<String> d = new ArrayDeque<String>();
        d.add("Red");
        d.addFirst("Blue");
        d.addLast("White");

        System.out.println("Elements in the Deque after add, addFirst and addLast: " + d);

        Deque<String> dq = new ArrayDeque<String>();
        dq.add("Green");
        dq.add("Orange");

        d.addAll(dq);

        System.out.println("Elements in the Deque after addAll: " + d);

        boolean val = d.offer("Pink");
        d.offerFirst("Goa");
        d.offerLast("Mumbai");

        System.out.println("Elements in the Deque after offer, offerFirst and offerLast: " + d);

        d.push("Purple");

        System.out.println("Elements in the Deque after push: " + d);
        System.out.println("");
    }

}
