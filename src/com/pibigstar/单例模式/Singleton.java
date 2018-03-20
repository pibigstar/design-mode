package com.pibigstar.单例模式;

/**
 * 单例模式  -- 懒汉模式
 * @author pibigstar
 *单例模式的优点：
    1，在内存中只有一个对象，节省内存空间。
    2，避免频繁的创建销毁对象，可以提高性能。
    3，避免对共享资源的多重占用。
    4，可以全局访问。
 *
 */
public class Singleton {
	private static Singleton singleton;
	private Singleton() {} //将构造私有
	
	public static Singleton getInstance() {
		if (singleton==null) {
			return new Singleton();
		}else {
			return singleton;
		}
	}
}

