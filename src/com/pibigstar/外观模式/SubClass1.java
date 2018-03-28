package com.pibigstar.外观模式;

/**
 * 子系统角色1
 * 可以同时有一个或者多个子系统。
 * 每个子系统都不是一个单独的类，
 * 而是一个类的集合。
 * 每个子系统都可以被客户端直接调用，
 * 或者被外观角色调用。子系统并不知道外观角色的存在，
 * 对于子系统而言，外观角色仅仅是另外一个客户端而已。
 * @author pibigstar
 *
 */
public class SubClass1 {
	
	public void method1(){
		System.out.println("这是子系统类1中的方法1");
	}    
	public void method2(){
		System.out.println("这是子系统类1中的方法2");
	}
}
