package singleton;

public class App {
	public static void main(String[] args) {
		TesteSingleton testeSingleton = TesteSingleton.getInstance();
		System.out.println(testeSingleton);
	}
}
