package madero;

import java.util.List;
import java.util.ArrayList;

public class Venda {
	
	public Venda() {
		this.produtos = new ArrayList<>();
	}
	
	private Comprador comprador;
	
	private Vendedor vendedor;
	
	private Produto produto;
	
	private List<Produto> produtos;
	
	public void add(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void concretizarVenda() {
		System.out.println("Comprador: " + this.comprador.getNome());
		System.out.print("Comprou os itens: \n");
		for (Produto prod : this.produtos) {
			System.out.println(prod.getNome() + " Valor do produto: " + prod.getPreco());
		}
		
		System.out.println("O vendedor é " + vendedor.getNome() + " A comissao é" + vendedor.getComissao());
		
	}
	
	public void cancelarVenda() {
		
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	

}
