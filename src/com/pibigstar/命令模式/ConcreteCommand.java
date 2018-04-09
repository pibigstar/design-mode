package com.pibigstar.命令模式;

/**
 * ConcreteCommand类：Command类的实现类，对抽象类中声明的方法进行实现。
 * @author pibigstar
 *
 */
public class ConcreteCommand extends Command{

	private Receiver receiver; 
	
	public ConcreteCommand(Receiver receiver){  
		this.receiver = receiver;  
	}  
	
	public void execute() {  
		this.receiver.doSomething();  
	}  

}
