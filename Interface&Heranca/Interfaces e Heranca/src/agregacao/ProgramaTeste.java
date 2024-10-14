package agregacao;

public class ProgramaTeste {
	public static void main(String[] args) {
		Produto produtoTV = criarProduto(1L,1489d ,"TV" );
		Produto produtoCel = criarProduto(2L,3899d ,"Celular" );

		Vendedor vendedorThiago = criarVendedor("Thiago", 0.10d);

		Comprador comprador1 = criarComprador("Pedro",5000d);

		Venda venda = new Venda();
		venda.setVendedor(vendedorThiago);
		venda.setComprador(comprador1);
		venda.add(produtoCel);
		venda.add(produtoTV);
		venda.concretizaVenda();
		System.out.println(venda);
		venda.cancelarVenda();

		venda = null;
		System.out.println(venda);
		System.out.println(produtoTV.getNomeProduto());




	}

	private static Comprador criarComprador(String nome, Double verba) {
		return new Comprador(nome, verba);
	}

	private static Vendedor criarVendedor(String nome, Double comissao) {
		Vendedor vendedor = new Vendedor();
		vendedor.setNome(nome);
		vendedor.setComissao(comissao);
		return vendedor;
	}

	private static Produto criarProduto(Long codigo, Double valor, String nome) {
		Produto produto = new Produto();
		produto.setCodigoProduto(codigo);
		produto.setPreco(valor);
		produto.setNomeProduto(nome);
		return produto;
	}
}
