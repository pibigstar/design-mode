package com.pibigstar.解释器模式;

import java.util.Stack;
/**
 *  解释器模式的适用场景
	在以下情况下可以使用解释器模式：
	有一个简单的语法规则，比如一个sql语句，如果我们需要根据sql语句进行rm转换，就可以使用解释器模式来对语句进行解释。
	一些重复发生的问题，比如加减乘除四则运算，但是公式每次都不同，有时是a+b-c*d，有时是a*b+c-d，等等等等个，公式千变万化，但是都是由加减乘除四个非终结符来连接的，这时我们就可以使用解释器模式。
 * @author pibigstar
 *
 */
public class Test {

	public static void main(String[] args) {
		String expression = "";  
		char[] charArray = expression.toCharArray();  
		Context ctx = new Context();  
		Stack<Expression> stack = new Stack<Expression>();  
		for(int i=0;i<charArray.length;i++){  
			//进行语法判断，递归调用  
		}  
		Expression exp = stack.pop();  
		exp.interpreter(ctx);  
	}

}
