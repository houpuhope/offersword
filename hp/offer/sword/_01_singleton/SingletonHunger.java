package hp.offer.sword._01_singleton;

public class SingletonHunger {
	private static SingletonHunger singleton = new SingletonHunger();
	
	public static SingletonHunger get() {
		return singleton;
	}
}
