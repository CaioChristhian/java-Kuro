package interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ICaneta caneta = new CanetaEsferografica();
        ICaneta giz = new Giz();

        caneta.escrever("Sexo");
        System.out.println(caneta.getCor());

        caneta.escreverComumATodas();
        giz.escreverComumATodas();
    }
}