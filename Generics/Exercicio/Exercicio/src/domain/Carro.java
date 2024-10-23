package domain;

public class Carro extends Veiculo{
	public Carro(String marca, Double velocidadeMaxima, Integer anoFabricacao, String modelo) {
		super(marca, velocidadeMaxima, anoFabricacao, modelo);
	}

	@Override
	public void acelerar() {
		System.out.println("Carro " + modelo + " está acelerando.");
	}

	@Override
	public void frear() {
		System.out.println("Carro " + modelo + " está freando.");
	}

	@Override
	public String toString() {
		return "Carro{" +
				"marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", anoFabricacao=" + anoFabricacao +
				", velocidadeMaxima=" + velocidadeMaxima +
				'}';
	}
}
