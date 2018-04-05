package com.pibigstar.解释器模式;
/**
 * 终结符表达式(Terminal Expression)角色：实现了抽象表达式角色所要求的接口，
 * 主要是一个interpret()方法；文法中的每一个终结符都有一个具体终结表达式与之相对应。
 * 比如有一个简单的公式R=R1+R2，在里面R1和R2就是终结符，
 * 对应的解析R1和R2的解释器就是终结符表达式。
 * @author pibigstar
 *
 */
public class TerminalExpression extends Expression{

	@Override
	public Object interpreter(Context ctx) {
		return null;
	}

}
