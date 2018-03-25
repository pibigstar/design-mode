package com.pibigstar.适配器模式.类适配器;

/**
 *  适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口。
 *  由于Adaptee没有提供queryAndAdd()方法，
 *  而目标接口又要求这个方法，因此适配器角色Adapter实现了这个方法。
 * @author pibigstar
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Target target = new Adapter();
		
		target.queryAndAdd();//使用了Adaptee里面没有的方法
		
	}

}
