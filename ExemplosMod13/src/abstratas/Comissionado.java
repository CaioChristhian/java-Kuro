package abstratas;

public class Comissionado extends Empregado {

    private double totalVenda;

    private double taxaComissao;

    @Override
    public double vencimento() {
        return (totalVenda * taxaComissao);
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
}
