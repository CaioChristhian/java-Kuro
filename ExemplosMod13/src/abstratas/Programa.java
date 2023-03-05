package abstratas;

public class Programa {

    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        assalariado.setCpf("08665138456");
        assalariado.setNome("Kuro");
        assalariado.setSobrenome("Christhian");
        assalariado.setSalario(500d);
        imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("08665138456");
        comissionado.setNome("Kuro2");
        comissionado.setSobrenome("Christhian");
        comissionado.setTotalVenda(4000);
        comissionado.setTaxaComissao(0.1);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("08665138456");
        horista.setNome("Kuro3");
        horista.setSobrenome("Christhian");
        horista.setHorasTrabalhadas(40);
        horista.setPrecoHora(40);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof Horista) {
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " tem " + empregado.vencimento() + " de salário");
    }
}
