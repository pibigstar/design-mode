package com.pibigstar.生成器模式;

/**
 * 指导者，负责对外接口，
 * 按一定顺序调用Builder中的三个为Product产品属性赋值方法。
 * @author pibigstar
 *
 */
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public  void setBuilder(Builder builder) {
		this.builder=builder;
	}

	//产品构建与组装方法
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getProduct();
	}

}
