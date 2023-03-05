package abstratas;

public class Assalariado extends Empregado {

    private double salario;

    @Override
    public double vencimento() {
        return 500;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
