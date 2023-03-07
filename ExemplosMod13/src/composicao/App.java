package composicao;

public class App {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(10L);
        banco.setNome("Kuro");

        ContaCorrente cc = new ContaCorrente();

        cc.setBanco(banco);
        cc.setSaldo(10d);

        Poupanca cp = new Poupanca();
        cp.setBanco(banco);
        cp.setSaldo(20d);

        System.out.println("Saldo conta poupança " + banco.getNome() + ": " + cp.getSaldo());
    }
}
