package com.pibigstar.桥接模式;
/**
 * 具体实现2
 * @author pibigstar
 *
 */
public class OracleDriver implements Driver{

	@Override
	public void getConnection() {
		System.out.println("加载Oracle驱动。。。。");
	}

}
