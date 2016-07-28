package com.inventriz.pattern.singleton;

public class TestSingleton implements Runnable {

	public static void main(String arg[]) {
		// SingletonUtil s = new SingletonUtil();// Compile error - The
		// constructor SingletonUtil() is not visible

		TestSingleton ts = new TestSingleton();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(ts);
			t.start();
		}

	}


	@Override
	public void run() {

		SingletonUtil s = SingletonUtil.getInstance();
		System.out.println(Thread.currentThread().getName()
				+ " running the singleton class " + s.toString());

		BadSingletonUtil bs = BadSingletonUtil.getInstance();
		System.out.println(Thread.currentThread().getName()
				+ " running the bad singleton class " + bs.toString());
	}

}
