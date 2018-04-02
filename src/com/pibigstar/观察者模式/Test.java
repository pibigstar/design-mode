package com.pibigstar.观察者模式;

public class Test {
	
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();  
        sub.attach(new ConcreteObserver1()); //添加观察者1  
        sub.attach(new ConcreteObserver2()); //添加观察者2  
        sub.doSomething();  
	}

}
