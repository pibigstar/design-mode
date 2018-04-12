package com.pibigstar.责任链模式;

/**
 * 具体处理类：具体处理类主要是对具体的处理逻辑和处理的适用条件进行实现。
 * @author pibigstar
 *
 */
public class ConcreteHandler3 extends Handler{

	protected Level getHandlerLevel() {  
		return new Level(5);  
	}
	
	public Response response(Request request) {  
		System.out.println("-----请求由处理器3进行处理-----");  
		return null;  
	}  

}
