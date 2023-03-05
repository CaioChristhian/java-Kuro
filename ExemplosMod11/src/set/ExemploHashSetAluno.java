package set;

import domain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploRemover();
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe
     * Aluno implemente o equals e hashcode
     */

    private static void exemploListaSimples() {
        System.out.println("***** exemploListaSimples *****");
        Set<Aluno> conjunto = new HashSet<>();

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

    private static void exemploRemover() {
        System.out.println("***** exemploRemover *****");
        Set<Aluno> conjunto = new HashSet<>();

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

        conjunto.remove(d);

        System.out.println(conjunto);

        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
        }
    }
}
