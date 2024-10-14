package agregacao;

public class Vendedor {
	private Double comissao;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public void vende(){
		System.out.println("Vendendo");
	}
}
