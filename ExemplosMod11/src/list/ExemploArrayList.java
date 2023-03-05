package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são.
 */

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    public static void exemploNumeros() {
        System.out.println("*** exemploNumeros ***");
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(8);
        System.out.println(numeros);
        System.out.println("");
    }

    public static void exemploListaSimples() {
        System.out.println("*** exemploListaSimples ***");
        List<String> lista = new ArrayList<String>();
        lista.add("Kuro");
        lista.add("Akaitoh");
        lista.add("Campos");
        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaSimplesOrdemAscendente() {
        System.out.println("*** exemploListaSimplesOrdemAscendente ***");
        List<String> lista = new ArrayList<String>();
        lista.add("Kuro");
        lista.add("Akaitoh");
        lista.add("Campos");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}