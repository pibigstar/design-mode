package com.pibigstar.适配器模式.对象适配器;

public class Test {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		
		target.queryAndAdd();
		
	}

}
