package forwhile;

public class ExemploForContinue {

    public static void main(String[] args) {
        for (int contador = 1; contador <= 100; contador++) {
            if (contador%5 != 0) { //verifica se é múltiplo de 5
                continue;
            }
            System.out.println("Contador: " + contador);
        }
    }
}
