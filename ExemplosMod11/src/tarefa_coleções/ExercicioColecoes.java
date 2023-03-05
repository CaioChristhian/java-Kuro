package tarefa_coleções;

import java.util.*;

public class ExercicioColecoes {

    public static void main(String[] args){
       // lerNome();
        lerNomeSexo();
    }

    private static void lerNomeSexo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nome e sexo separados por ',' sem espaços ex: 'João-Masculino,Marcos-M' ");

        String resposta = s.next();
        String[] nomes = resposta.split(",");

        List<String> listaM = new ArrayList<>();
        List<String> listaF = new ArrayList<>();

        for (String nome : nomes) {
            if (nome.toUpperCase().contains("-M") || nome.toUpperCase().contains("-MASCULINO")) {
                listaM.add(nome.toUpperCase());
            }
            else if (nome.toUpperCase().contains("-F") || nome.toUpperCase().contains("-FEMININO")) {
                listaF.add(nome.toUpperCase());
            }
        }

        Collections.sort(listaM);
        Collections.sort(listaF);

        System.out.println("FEMININO");
        System.out.println(listaF);
        System.out.println("");
        System.out.println("MASCULINO");
        System.out.println(listaM);
    }

    private static void lerNome() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por , sem espaços:");

        String resposta = s.next();
        String[] nomes = resposta.split(",");
        List<String> lista = new ArrayList<>();

        for (String nome : nomes) {
            lista.add(nome);
        }

        Collections.sort(lista);
        System.out.println(lista);
    }
}
