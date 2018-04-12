package com.pibigstar.责任链模式;

/**
 * 如果满足条件1，则由Handler1来处理，
 * 不满足则向下传递；如果满足条件2，则由Handler2来处理，
 * 不满足则继续向下传递，以此类推，直到条件结束。
 * @author pibigstar
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		Response response = handler1.handleRequest(new Request(new Level(4)));
		
	}

}
