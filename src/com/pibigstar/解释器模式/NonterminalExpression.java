package com.pibigstar.解释器模式;
/**
 * 非终结符表达式(Nonterminal Expression)角色：文法中的每一条规则都需要一个具体的
 * 非终结符表达式，非终结符表达式一般是文法中的运算符或者其他关键字，
 * 比如公式R=R1+R2中，“+"就是非终结符，
 * 解析“+”的解释器就是一个非终结符表达式。
 * @author pibigstar
 *
 */
public class NonterminalExpression extends Expression{

	public NonterminalExpression(Expression... expressions) {
	}
	
	@Override
	public Object interpreter(Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
