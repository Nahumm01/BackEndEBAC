import interfaces.ICarFactory;
import interfaces.ISUV;
import interfaces.ISedan;

public class FabricaFord implements ICarFactory {
	public ISedan createSedan() {
		return new FordFusion();
	}


	public ISUV createSUV() {
		return new FordExplorer();
	}
}