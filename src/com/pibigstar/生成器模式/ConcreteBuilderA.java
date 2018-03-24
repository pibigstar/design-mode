package com.pibigstar.生成器模式;

/**
 * 建造者A
 * @author pibigstar
 *
 */
public class ConcreteBuilderA extends Builder{

	private Product A;
	
	
	public ConcreteBuilderA() {
		A = new Product();
	}

	@Override
	public void buildPartA() {
		A.setPartA("馒头");
	}

	@Override
	public void buildPartB() {
		A.setPartB("鸡肉");
		
	}

	@Override
	public void buildPartC() {
		A.setPartC("绿茶");
		
	}

	@Override
	public Product getProduct() {
		return A;
	}

}
