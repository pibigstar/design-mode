package com.pibigstar.代理模式.动态代理;

public class UserDaoImpl implements UserDaoI{

	@Override
	public void queryUser() {
		System.out.println("查询用户。。。。。");
	}

	@Override
	public void updateUser() {
		System.out.println("更新用户。。。。。");
	}

}
