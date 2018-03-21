package com.pibigstar.工厂模式;

public class Test {
	
	public static void main(String[] args) {
		
		ICarFactory factory = null;
		
		//bike
		factory = new BikeFactory();
		Car bike = factory.getCar();
		bike.gotoWork();
		
		//bus
		factory = new BusFactory();
		Car bus = factory.getCar();
		bus.gotoWork();
		
	}
}
