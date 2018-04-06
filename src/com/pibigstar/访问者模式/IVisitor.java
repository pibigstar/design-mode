package com.pibigstar.访问者模式;

/**
 *  抽象访问者：抽象类或者接口，声明访问者可以访问哪些元素，
 *  具体到程序中就是visit方法中的参数定义哪些对象是可以被访问的。
 * @author pibigstar
 *
 */
public interface IVisitor {
	
	public void visit(ConcreteElement1 element1);
	public void visit(ConcreteElement2 element2);

}
