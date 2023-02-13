import domain.Aluno;
import domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {
    public static void main(String args[]) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("**** exemploListaSimplesOrdenadaClasseExterna ****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Kuro", "Java", 8);
        Aluno b = new Aluno("Akaito", "Javascript", 6);
        Aluno c = new Aluno("Campos", "Javascript", 7);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("**** exemploListaSimplesOrdenadaComparatorAluno ****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Kuro", "Java", 8);
        Aluno b = new Aluno("Akaito", "Javascript", 6);
        Aluno c = new Aluno("Campos", "Javascript", 7);
        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println("Lista sem ordenação " + lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenação " + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota: " + lista);

        System.out.println("");
    }
}
