package com.pibigstar.单例模式;

/**
 * 单例模式 -- 饿汉模式
 * @author pibigstar
 *
 */
public class Singleton2 {

	private static Singleton2 singleton2 = new Singleton2();
	private Singleton2() {}
	public static Singleton2 getInstance() {
		return singleton2;
	}
}
