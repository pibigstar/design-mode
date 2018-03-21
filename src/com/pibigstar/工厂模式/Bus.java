package com.pibigstar.工厂模式;

/**
 * 定义实际产品类
 * @author pibigstar
 *
 */
public class Bus implements Car{

	@Override
	public void gotoWork() {
		System.out.println("坐公交车上班");
	}
}
