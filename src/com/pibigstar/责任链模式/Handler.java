package com.pibigstar.责任链模式;

/**
 * 抽象处理类：
 * 抽象处理类中主要包含一个指向下一处理类的成员变量nextHandler
 * 和一个处理请求的方法handRequest，handRequest方法的
 * 主要主要思想是，如果满足处理的条件，则有本处理类来进行处理，
 * 否则由nextHandler来处理。
 * @author pibigstar
 *
 */
public abstract class Handler {
	private Handler nextHandler;
	
	public final Response handleRequest(Request request) {
		Response response = null;
		if (this.getHandlerLevel().above(request.getLevel())) {
			response = this.response(request);
		}else {
			if (this.nextHandler!=null) {
				this.nextHandler.handleRequest(request);//传给下一个处理器
			}else {
				System.out.println("----------没有合适的处理器----------");
			}
		}
		return response;
	}
	
	  public void setNextHandler(Handler handler){  
          this.nextHandler = handler;  
      }  
	  
      protected abstract Level getHandlerLevel();  
      
      public abstract Response response(Request request);  

}
