package com.pibigstar.解释器模式;
/**
 * 抽象表达式(Expression)角色：声明一个所有的具体表达式角色都需要实现的抽象接口
 * 。这个接口主要是一个interpret()方法，称做解释操作。
 * @author pibigstar
 *
 */
public abstract class Expression {
	
	public abstract Object interpreter(Context ctx);  

}
