import interfaces.ISUV;

public class ToyotaRAV4 implements ISUV {
	@Override
	public void montar() {
		System.out.println("Montando um novo RAV4");
	}
}
