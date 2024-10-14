package interfaces;

public interface ICarro {
	default void andar (){
		System.out.println("Carro andando...");
	}

	default void parar (){
		System.out.println("Carro parando...");
	}
}
