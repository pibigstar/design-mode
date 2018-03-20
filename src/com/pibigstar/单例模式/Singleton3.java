package com.pibigstar.单例模式;

/**
 * 单例模式 -- 双重锁模式
 * @author pibigstar
 *
 */
public class Singleton3 {
	// volatile 使其内存可见性
	private static volatile Singleton3 instance = null;

	private Singleton3() {}
	
	private static Singleton3 getInstance() {
		if (instance==null) {
			
			synchronized (Singleton3.class) {
				if (instance==null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
