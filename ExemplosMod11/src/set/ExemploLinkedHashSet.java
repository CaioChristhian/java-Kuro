package set;

import domain.Aluno;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("***** exemploListaSimples *****");
        Set<Aluno> conjunto = new LinkedHashSet<>();

        Aluno a = new Aluno("Kuro", "Java", 8);
        Aluno b = new Aluno("Aka", "Javascript", 7);
        Aluno c = new Aluno("Musashi", "Django", 6);
        Aluno d = new Aluno("Sakura", "Java", 9);
        Aluno e = new Aluno("Kuro", "Java", 8);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        conjunto.add(e);

        System.out.println(conjunto);
    }
}
