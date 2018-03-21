package com.pibigstar.工厂模式;

/**
 * 具体的工厂子类，分别为每个具体的产品类创建不同的工厂子类
 * @author pibigstar
 *
 */
public class BusFactory implements ICarFactory{

	@Override
	public Car getCar() {
		return new Bus();
	}
}
