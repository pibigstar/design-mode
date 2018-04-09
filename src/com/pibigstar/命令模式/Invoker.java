package com.pibigstar.命令模式;

/**
 * Invoker类：调用者，负责调用命令。
 * @author pibigstar
 *
 */
public class Invoker {

	private Command command;  
	public void setCommand(Command command) {  
		this.command = command;  
	}  
	public void action(){  
		this.command.execute();  
	}  

}
