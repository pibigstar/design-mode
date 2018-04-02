package com.pibigstar.观察者模式;
/**
 * 观察者：观察者角色一般是一个接口，
 * 它只有一个update方法，在被观察者状态发生变化时，这个方法就会被触发调用。
 * @author pibigstar
 *
 */
public interface Observer {

	void update();
	
}
