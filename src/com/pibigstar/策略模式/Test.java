package com.pibigstar.策略模式;

public class Test {
	public static void main(String[] args) {
		System.out.println("-----策略1-------");
		Context context = new Context(new ConcreteStrategy1());
		context.execute();
		
		System.out.println("-------策略2--------");
		context = new Context(new ConcreteStrategy2());
		context.execute();
	}
	
}
