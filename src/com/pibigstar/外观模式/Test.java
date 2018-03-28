package com.pibigstar.外观模式;

/**
 * Facade类其实相当于子系统中SubClass类的外观界面，
 * 有了这个Facade类，那么客户端就不需要亲自调用子系统中的
 * 那些具体实现的子类了，也不需要知道系统内部的实现细节，
 * 甚至都不需要知道这些子类的存在，客户端只需要跟Facade类交互就好了，
 * 从而更好地实现了客户端和子系统中具体类的解耦，让客户端更容易地使用系统。
 * @author pibigstar
 *
 */
public class Test {
	
	public static void main(String[] args) {
		FacadeClass facadeClass = new FacadeClass();
		facadeClass.facadeMethod();
	}

}
