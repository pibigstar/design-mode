package com.pibigstar.观察者模式;
/**
 * 具体的被观察者：
 * 使用这个角色是为了便于扩展，可以在此角色中定义具体的业务逻辑。
 * @author pibigstar
 *
 */
public class ConcreteSubject extends Subject{

	@Override
	public void doSomething() {
		System.out.println("-------被观察者事件反生-----");  
		this.notifyObserver();  
	}


}
