package interfaces;

public class Giz implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo " + texto + " da" + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Azul";
    }

    @Override
    public void escreverComumATodas() {
        System.out.println("Quadro negro");
    }
}
