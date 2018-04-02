package com.pibigstar.观察者模式;

import java.util.Vector;
/**
 * 被观察者：
 * Vector容器是被观察者类的核心，
 * attach方法是向这个容器中添加观察者对象；
 * detach方法是从容器中移除观察者对象；
 * notifyObserver方法是依次调用观察者对象的对应方法。
 * 这个角色可以是接口，也可以是抽象类或者具体的类，
 * @author pibigstar
 */
public abstract class Subject {

	private Vector<Observer> obs = new Vector<Observer>();  

	public void attach(Observer obs){  
		this.obs.add(obs);  
	}  
	public void detach(Observer obs){  
		this.obs.remove(obs);  
	}  
	protected void notifyObserver(){  
		for(Observer o: obs){  
			o.update();  
		}  
	}  
	public abstract void doSomething();  
}
