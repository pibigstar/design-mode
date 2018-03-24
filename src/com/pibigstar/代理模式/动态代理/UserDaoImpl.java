package com.pibigstar.代理模式.动态代理;

/**
 * 代理的真实对象
 * @author pibigstar
 *
 */
public class UserDaoImpl implements UserDaoI{

	@Override
	public void queryUser(String id) {
		System.out.println("查询用户的id："+id);
	}

	@Override
	public void updateUser() {
		System.out.println("更新用户。。。。。");
	}

}
