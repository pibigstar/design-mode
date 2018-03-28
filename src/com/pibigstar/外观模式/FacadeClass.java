package com.pibigstar.外观模式;

/**
 * 外观(Facade)角色 ：
 * 客户端可以调用这个角色的方法。
 * 此角色知晓相关子系统的功能和责任。
 * 在正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
 * @author pibigstar
 */
public class FacadeClass {

	/**
	 * facadeMethod是让客户端去调用的，而具体的实现我们
	 * 委派给子系统去实现（SubClass1、SubClass2）
	 */
	public void facadeMethod() {
		SubClass1 subClass1 = new SubClass1();
		subClass1.method1();
		SubClass2 subClass2 = new SubClass2();
		subClass2.method1();
	}
	
}

