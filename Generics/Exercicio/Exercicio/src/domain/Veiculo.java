package domain;

public abstract class Veiculo {
	public String marca;
	public String modelo;
	public Integer anoFabricacao;
	public Double velocidadeMaxima;

	public Veiculo(String marca, Double velocidadeMaxima, Integer anoFabricacao, String modelo) {
		this.marca = marca;
		this.velocidadeMaxima = velocidadeMaxima;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
	}

	public abstract void acelerar();
	public abstract void frear();
}
