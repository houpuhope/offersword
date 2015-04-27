package hp.offer.sword._01_singleton;

public class SingletonFroSingleThread {
	private static SingletonFroSingleThread singleton = null;
	
	public static SingletonFroSingleThread get() {
		if(null == singleton) {
			singleton = new SingletonFroSingleThread();
		}
		return singleton;
	}
}
