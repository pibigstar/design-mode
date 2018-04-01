package com.pibigstar.桥接模式;

/**
 * 定义一个桥,持有一个Driver实例
 * @author pibigstar
 *
 */
public abstract class DriverManager {
	
	private Driver driver;

	public void getConnection() {
		driver.getConnection();
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}
