package madero;

public class Programa {

	public static void main(String[] args) {
		
		Produto produtoTv = criarProduto(1L,20d,"Televisao");
		Produto produtoCel = criarProduto(1L,1000d,"Celular");
		
		Vendedor vendedor = criarVendedor("Rodrigo", 10d);
		Comprador comprador = criarComprador("Joyce", 500d);
		Venda venda = new Venda();
		venda.setVendedor(vendedor);
		venda.setComprador(comprador);
		venda.add(produtoCel);
		venda.add(produtoTv);
		
		venda.concretizarVenda();
		
		
		
	}
	
	
	
	
	private static Comprador criarComprador(String nome, double verba) {
		Comprador comprador = new Comprador(nome , verba);
		return comprador;
	
	}




	private static Vendedor criarVendedor(String nome, double comissao) {
	
		Vendedor vendedor = new Vendedor();
		vendedor.setComissao(null);
		vendedor.setNome(nome);
		
		return vendedor;
	}




	private static Produto criarProduto(Long codigo, Double valor, String nome) {
		
		Produto produto = new Produto();
		produto.setCodigo(1L);
		produto.setPreco(20d);
		produto.setNome("Televisao");
		return produto;
		
	}
	
	
	
	
	

}
