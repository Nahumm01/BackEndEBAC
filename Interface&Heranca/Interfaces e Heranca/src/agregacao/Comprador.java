package agregacao;

public class Comprador {
	private Double verba;
	private String nome;

	public Comprador(String nome, Double verba) {
		this.verba = verba;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getVerba() {
		return verba;
	}

	public void setVerba(Double verba) {
		this.verba = verba;
	}

	public void comprar(){
		System.out.println("Comprando");
	}
}
