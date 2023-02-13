import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double nota1;
        Double nota2;
        Double nota3;
        Double nota4;
        Double media;

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite 4 Notas:\n");
        nota1 = ler.nextDouble();
        nota2 = ler.nextDouble();
        nota3 = ler.nextDouble();
        nota4 = ler.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Media: " + media);
            System.out.println("Aluno Aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno de Recuperação");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
}