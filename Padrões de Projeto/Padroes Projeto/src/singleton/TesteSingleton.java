package singleton;

public class TesteSingleton {

	private static TesteSingleton testeSingleton;

	private TesteSingleton(){

	}

	public static TesteSingleton getInstance(){
		if(testeSingleton == null){
			testeSingleton = new TesteSingleton();
		}
		return testeSingleton;
	}

}
