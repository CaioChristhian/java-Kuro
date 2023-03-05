package exercicioLerNomeSexo;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LerNome_Sexo {
    public static void main(String[] args) {
        nome_Sexo();
    }

    private static void nome_Sexo() {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu nome e sexo nesta ordem /n");
        String nome = read.next();
        String sexo = read.next();

        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {
            Set<Homem> homem = new LinkedHashSet<>();

            Homem a = new Homem(nome, sexo.toUpperCase());

            homem.add(a);

            System.out.println("**** Grupo Masculino ****");
            System.out.println(homem);
        } else if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")) {
            Set<Mulher> mulher = new LinkedHashSet<>();

            Mulher a = new Mulher(nome, sexo.toUpperCase());

            mulher.add(a);

            System.out.println("**** Grupo Feminino ****");
            System.out.println(mulher);
        }

    }
}
