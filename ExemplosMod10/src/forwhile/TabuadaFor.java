package forwhile;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número para gerar a tabuada: ");
        int num = read.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }

}
