import java.util.Locale;
import java.util.Scanner;

public class Wrapping {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        int n1;

        System.out.println("Digite um numero inteiro: ");
        n1 = ler.nextInt();

        double n2 = n1;

        System.out.println(n2);
    }
}