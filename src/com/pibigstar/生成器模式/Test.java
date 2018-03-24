package com.pibigstar.生成器模式;

/**
 * Product：产品，表示被生成器构建的复杂对象，包含多个部件。
 * Builder：生成器接口，定义创建一个Product对象所需要的各个部件的操作。
 * ConcreteBuilder：具体的生成器实现，实现各个部件的创建，并负责组装Product对象的各个部件，同时还提供一个让用户获取组装完成后的产品对象的方法。
 * Director：指导者，也被称导向者，主要用来使用Builder接口，以一个统一的过程来构建所需要的Product对象。
 * @author pibigstar
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		//Builder builder = new ConcreteBuilderA();//建造者
		Builder builder = new ConcreteBuilderB();//建造者
		
		Director director = new Director(builder);//指导者
		
		System.out.println(director.construct());
		
	}

}
