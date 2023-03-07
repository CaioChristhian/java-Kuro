package exercicio;

public class App {

    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica();
        Juridica pessoaJuridica = new Juridica();

        pessoaFisica.setNome("Kuro");
        pessoaFisica.setCpf("6546358640");
        pessoaFisica.setSalario(1000D);

        pessoaJuridica.setNome("Caio");
        pessoaJuridica.setCnpj("6546358640000-1");
        pessoaJuridica.setLucro(10000D);

        System.out.println("***** Pessoa Fisica");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Salario: " + pessoaFisica.getSalario());


        System.out.println("***** Pessoa Juridica");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Lucro: " + pessoaJuridica.getLucro());

    }
}
