package hp.offer.sword._01_singleton;

public class SingletonLazy {
	private static SingletonLazy singleton = null;

	public static SingletonLazy get() {
		if (null == singleton) {
			synchronized (SingletonLazy.class) {
				if (null == singleton) {
					singleton = new SingletonLazy();
				}
			}
		}

		return singleton;
	}
}
