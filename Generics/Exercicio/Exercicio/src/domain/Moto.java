package domain;

public class Moto extends Veiculo{
	public Moto(String marca, Double velocidadeMaxima, Integer anoFabricacao, String modelo) {
		super(marca, velocidadeMaxima, anoFabricacao, modelo);
	}

	@Override
	public void acelerar() {
		System.out.println("Moto " + modelo + " está acelerando.");
	}

	@Override
	public void frear() {
		System.out.println("Moto " + modelo + " está freando.");
	}

	@Override
	public String toString() {
		return "Moto{" +
				"marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", anoFabricacao=" + anoFabricacao +
				", velocidadeMaxima=" + velocidadeMaxima +
				'}';
	}
}
