package generics;

public class GenericsEntry <T,E>{
	private T data;
	private E codigo;

	public GenericsEntry(T data, E codigo){
		this.data = data;
		this.codigo = codigo;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public E getCodigo() {
		return codigo;
	}

	public void setCodigo(E codigo) {
		this.codigo = codigo;
	}
}
