package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {

    public static void main(String[] args) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("***** exemploListaSimples *****");
        Map<Integer, String> lista = new LinkedHashMap<>();
        lista.put(1, "Kuro");
        lista.put(2, "Campos");
        lista.put(4, "Aka");
        lista.put(3, "Shizawa");

        System.out.println(lista);
        System.out.println("");
    }
}
