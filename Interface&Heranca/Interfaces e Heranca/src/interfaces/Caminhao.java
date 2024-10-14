package interfaces;

public class Caminhao implements ICarro{
	@Override
	public void andar() {
		ICarro.super.andar();
	}

	@Override
	public void parar() {
		ICarro.super.parar();
	}
}
