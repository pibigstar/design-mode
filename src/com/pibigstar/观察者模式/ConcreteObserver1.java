package com.pibigstar.观察者模式;
/**
 * 具体的观察者：
 * 观察者接口的具体实现，在这个角色中，
 * 将定义被观察者对象状态发生变化时所要处理的逻辑。
 * @author pibigstar
 *
 */
public class ConcreteObserver1 implements Observer{

	@Override
	public void update() {
		System.out.println("------观察者1收到信息并开始处理---------");
	}

}
