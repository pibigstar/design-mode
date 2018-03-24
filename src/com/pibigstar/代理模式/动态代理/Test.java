package com.pibigstar.代理模式.动态代理;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		UserDaoI userImpl = new UserDaoImpl();
		 //我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
		UserDaoHandler handler = new UserDaoHandler(userImpl);
		UserDaoI userProxy = (UserDaoI) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),userImpl.getClass().getInterfaces(), handler);
		userProxy.queryUser("123");
		userProxy.updateUser();
	}

}
