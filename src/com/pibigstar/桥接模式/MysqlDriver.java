package com.pibigstar.桥接模式;
/**
 * 具体实现1
 * @author pibigstar
 *
 */
public class MysqlDriver implements Driver{

	@Override
	public void getConnection() {
		System.out.println("加载Mysql驱动。。。。");
	}

}
