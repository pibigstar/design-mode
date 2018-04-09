package com.pibigstar.命令模式;

/**
 * 当我们调用时，执行的时序首先是调用者类，
 * 然后是命令类，最后是接收者类。
 * 也就是说一条命令的执行被分成了三步，
 * 它的耦合度要比把所有的操作都封装到一个类中要低的多，
 * 而这也正是命令模式的精髓所在：把命令的调用者与执行者分开，
 * 使双方不必关心对方是如何操作的。
 * @author pibigstar
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Receiver receiver = new Receiver();  
		Command command = new ConcreteCommand(receiver);  
		//客户端直接执行具体命令方式（此方式与类图相符）  
		command.execute();  

		//客户端通过调用者来执行命令  
		Invoker invoker = new Invoker();  
		invoker.setCommand(command);  
		invoker.action();  
	}

}
