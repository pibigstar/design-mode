package com.pibigstar.桥接模式;
/**
 * 每个数据库提供各自的实现，
 * 用一个叫做数据库驱动的程序来桥接
 * @author pibigstar
 *
 */
public class Test {

	public static void main(String[] args) {
		DriverManager driverManager = new MyDriverManager();
		/**
		 * 加载mysql驱动
		 */
		Driver driver = new MysqlDriver();
		driverManager.setDriver(driver);
		driverManager.getConnection();
		
		/**
		 * 加载Oracle驱动
		 */
		driver = new OracleDriver();
		driverManager.setDriver(driver);
		driverManager.getConnection();
	}
	
}
