package com.pibigstar.访问者模式;

/**
 * 访问者：实现抽象访问者所声明的方法，
 * 它影响到访问者访问到一个类后该干什么，要做什么事情。
 * @author pibigstar
 *
 */
public class Visitor implements IVisitor{

	@Override
	public void visit(ConcreteElement1 element1) {
		element1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 element2) {
		element2.doSomething();
	}

}
