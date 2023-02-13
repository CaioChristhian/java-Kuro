import java.util.Locale;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        Alunos aluno = new Alunos();
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite 4 Notas:\n");
        nota1 = ler.nextDouble();
        aluno.setNota1(nota1);

        nota2 = ler.nextDouble();
        aluno.setNota2(nota2);

        nota3 = ler.nextDouble();
        aluno.setNota3(nota3);

        nota4 = ler.nextDouble();
        aluno.setNota4(nota4);

        System.out.println("Media: " + aluno.calculoMedia());

    }
}