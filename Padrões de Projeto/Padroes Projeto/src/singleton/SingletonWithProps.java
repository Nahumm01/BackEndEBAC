package singleton;

public class SingletonWithProps {
	private static SingletonWithProps Singleton;
	private String value;

	private SingletonWithProps(String value) {
		this.value = value;
	}

	public static SingletonWithProps getInstance(){
		if(Singleton == null){
			Singleton = new SingletonWithProps(getInstance().value);
		}
		return Singleton;
	}
}
