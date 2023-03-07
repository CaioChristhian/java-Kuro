package composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contaCorrente;

    private Set<Poupanca> contaPoupanca;

    public void Banco() {
        this.contaCorrente = new HashSet<>();
        this.contaPoupanca = new HashSet<>();
    }

    public void add(ContaCorrente cc) {
        this.contaCorrente.add(cc);
    }

    public void add(Poupanca cp) {
        this.contaPoupanca.add(cp);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
