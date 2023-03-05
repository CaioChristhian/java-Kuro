package set;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet não tem ordem
 * O acesso aos dados é mais rápido que um TreeSet, mas nada garante que os dados estaram ordenados.
 * Não reperte valores na lista
 *
 * @author kuro
 */
public class ExemploHashSet {

    public static void main(String[] args) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("***** exemploListaSimples *****");
        Set<String> lista = new HashSet<>();
        lista.add("Kuro");
        lista.add("Akaitoh");
        lista.add("Shizawa");
        lista.add("Kuro");

        System.out.println(lista);
    }
}
