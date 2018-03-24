package com.pibigstar.生成器模式;

/**
 * 建造者B
 * @author pibigstar
 *
 */
public class ConcreteBuilderB extends Builder{

	private Product B;
	
	public ConcreteBuilderB() {
		B = new Product();
	}

	@Override
	public void buildPartA() {
		B.setPartA("米饭");
	}

	@Override
	public void buildPartB() {
		B.setPartB("青菜");
	}

	@Override
	public void buildPartC() {
		B.setPartC("啤酒");
	}

	@Override
	public Product getProduct() {
		return B;
	}

}
