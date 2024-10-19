import interfaces.ISedan;

public class ToyotaCorolla implements ISedan {
	@Override
	public void montar() {
		System.out.println("Montando um novo Corolla");
	}
}
