package com.pibigstar.代理模式.动态代理;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		UserDaoI userImpl = new UserDaoImpl();
		UserDaoHandler handler = new UserDaoHandler(userImpl);
		UserDaoI userProxy = (UserDaoI) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {UserDaoI.class}, handler);
		userProxy.queryUser();
		userProxy.updateUser();
	}

}
