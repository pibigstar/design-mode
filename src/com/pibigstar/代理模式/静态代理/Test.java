package com.pibigstar.代理模式.静态代理;

public class Test {
	
	public static void main(String[] args) {
		UserDaoI userDaoImpl = new UserDaoImpl();
		UserDaoProxy proxy = new UserDaoProxy(userDaoImpl);
		proxy.queryUser();
	}

}
