package com.inventriz.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton implements Runnable {

	public static void main(String arg[]) {
		// SingletonUtil s = new SingletonUtil();// Compile error - The
		// constructor SingletonUtil() is not visible
		
		try {
			BadSingletonUtil su1 = BadSingletonUtil.getInstance();
			System.out.println("su1 == "+su1);
			
			Class<?> su1Class = Class.forName("com.inventriz.pattern.singleton.BadSingletonUtil");
			Constructor<BadSingletonUtil> cons = (Constructor<BadSingletonUtil>) su1Class.getDeclaredConstructor();
			cons.setAccessible(true);
			BadSingletonUtil su2 = cons.newInstance();
			System.out.println("su2 == "+su2);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TestSingleton ts = new TestSingleton();
		for (int i = 0; i < 2; i++) {
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
