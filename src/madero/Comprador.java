package madero;

public class Comprador {
	
	private Double verba;
	private String nome;
	
	
	public Comprador(String nome2, double verba2) {
		this.nome = nome;
		this.verba = verba;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void comprar() {
		System.out.println("Comprado!");
		
	}

	public Double getVerba() {
		return verba;
	}

	public void setVerba(Double verba) {
		this.verba = verba;
	}

}
