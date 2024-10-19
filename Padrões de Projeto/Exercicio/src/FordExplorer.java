import interfaces.ISUV;

public class FordExplorer implements ISUV {
	@Override
	public void montar() {
		System.out.println("Montando um novo Explorer");
	}
}
