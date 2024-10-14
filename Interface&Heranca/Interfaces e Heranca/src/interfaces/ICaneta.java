package interfaces;

public interface ICaneta {
	public void escrever(String texto);
	public String getCor();
	default void escritaTodos(){
		System.out.println("Escrita Comum");
	};
}
