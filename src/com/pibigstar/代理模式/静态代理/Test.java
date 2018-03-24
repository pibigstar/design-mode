package com.pibigstar.代理模式.静态代理;

/**
 *  1，  抽象角色：声明真实对象和代理对象的共同接口。
	2，  代理角色：代理对象角色内部含有对真实对象的引用，
	从而可以操作真实对象，同时代理对象提供与真实对象相同的接口以便在任何时刻
	都能代替真实对象。同时，代理对象可以在执行真实对象操作时，
	附加其他的操作，相当于对真实对象进行封装。
	
	3，  真实角色：代理角色所代表的真实对象，是我们最终要引用的对象
 * @author pibigstar
 *
 */
public class Test {
	
	public static void main(String[] args) {
		UserDaoI userDaoImpl = new UserDaoImpl();
		UserDaoProxy proxy = new UserDaoProxy(userDaoImpl);
		proxy.queryUser();
	}

}
