import interfaces.ICarFactory;
import interfaces.ISUV;
import interfaces.ISedan;

public class FabricaToyota implements ICarFactory {
	public ISedan createSedan() {
		return new ToyotaCorolla();
	}

	public ISUV createSUV() {
		return new ToyotaRAV4();
	}
}
