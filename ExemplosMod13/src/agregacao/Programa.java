package agregacao;

public class Programa {
    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 10d, "TV");
        Produto celular = criarProduto(2L, 100d, "Celular");

        Vendedor vendedor = criarVedendor("Rodrigo", 10d);

        Comprador comprador = criarComprador("Rodrigo", 2000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(celular);

        venda.concretizaVenda();
        System.out.println(venda);
        venda.cancelaVenda();
        venda = null;
        System.out.println(venda);

    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVedendor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(long codigo, double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
