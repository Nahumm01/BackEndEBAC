import interfaces.ICarFactory;
import interfaces.ISUV;
import interfaces.ISedan;

public class FabricaCarrosTeste {
	public static void main(String[] args) {
		ICarFactory fabricaToyota = new FabricaToyota();
		ICarFactory fabricaFord = new FabricaFord();

		ISedan toyotaSedan = fabricaToyota.createSedan();
		ISUV fordSUV = fabricaFord.createSUV();

		toyotaSedan.montar();
		fordSUV.montar();
	}
}
