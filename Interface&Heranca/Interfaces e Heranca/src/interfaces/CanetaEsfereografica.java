package interfaces;

public class CanetaEsfereografica implements ICaneta {

	@Override
	public void escrever(String texto) {
		System.out.println("Escrevendo o valor " + texto + " na classe " + this.getClass().getSimpleName());
	};

	@Override
	public String getCor() {
		return "Preta";
	};
}