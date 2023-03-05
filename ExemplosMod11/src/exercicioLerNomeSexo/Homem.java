package exercicioLerNomeSexo;

import java.util.Objects;

public class Homem {
    private String nome;
    private String sexo;

    public Homem(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomeSexo() {
        return this.nome + ", " + this.sexo;
    }

    public String toString() {
        return getNomeSexo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homem homem = (Homem) o;
        return Objects.equals(nome, homem.nome) && Objects.equals(sexo, homem.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }
}
