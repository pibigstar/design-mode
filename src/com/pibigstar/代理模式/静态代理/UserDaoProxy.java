package com.pibigstar.代理模式.静态代理;

/**
 * 代理角色：代理对象角色内部含有对真实对象的引用，
 * 从而可以操作真实对象，同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。
 * 同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
 * @author pibigstar
 *
 */
public class UserDaoProxy implements UserDaoI{

	private UserDaoI userdao;

	public UserDaoProxy(UserDaoI userImpl) {    
		this.userdao = userImpl;    
	}    


	@Override
	public void queryUser() {
		//这里可以扩展，增加一些查询之前需要执行的方法   
		System.out.println("静态代理--增加一些查询之前需要执行的方法");
		userdao.queryUser();
		//这里可以扩展，增加一些查询之后需要执行的方法
		System.out.println("静态代理--增加一些查询之后需要执行的方法");
		
	}

	@Override
	public void updateUser() {
		//这里可以扩展，增加一些查询之前需要执行的方法   
		System.out.println("静态代理--增加一些查询之前需要执行的方法");
		userdao.updateUser();
		//这里可以扩展，增加一些查询之后需要执行的方法
		System.out.println("静态代理--增加一些查询之后需要执行的方法");
	}

}
