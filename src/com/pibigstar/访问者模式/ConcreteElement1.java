package com.pibigstar.访问者模式;
/**
 * 元素类：实现抽象元素类所声明的accept方法，
 * 通常都是visitor.visit(this)，基本上已经形成一种定式了。
 * @author pibigstar
 *
 */
public class ConcreteElement1 extends Element{

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		System.out.println("这是元素1");
	}

	

}
