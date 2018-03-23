package com.pibigstar.代理模式.静态代理;

/**
 * 真实角色：代理角色所代表的真实对象，是我们最终要引用的对象。
 * @author pibigstar
 *
 */
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
