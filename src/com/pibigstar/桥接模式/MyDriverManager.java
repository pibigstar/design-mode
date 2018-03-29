package com.pibigstar.桥接模式;
/**
 * 桥的实体类
 * @author pibigstar
 *
 */
public class MyDriverManager extends DriverManager{

	@Override
	public void getConnection() {
		//调用持有的实例的getConnection方法
		getDriver().getConnection();
	}
}
