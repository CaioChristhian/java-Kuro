package exercicioLerNomeSexo;

import java.util.Objects;

public class Mulher {
    private String nome;
    private String sexo;

    public Mulher(String nome, String sexo) {
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
        Mulher mulher = (Mulher) o;
        return Objects.equals(nome, mulher.nome) && Objects.equals(sexo, mulher.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }
}
