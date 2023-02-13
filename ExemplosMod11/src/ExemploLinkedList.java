import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new LinkedList<>();
        lista.add("Kuro");
        lista.add("Akaitoh");
        lista.add("Campos");
        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaSimplesOrdemAscendente() {
        System.out.println("*** exemploListaSimplesOrdemAscendente ***");
        List<String> lista = new LinkedList<>();
        lista.add("Kuro");
        lista.add("Akaitoh");
        lista.add("Campos");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
