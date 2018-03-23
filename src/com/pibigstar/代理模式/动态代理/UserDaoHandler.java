package com.pibigstar.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理角色处理器
 * @author pibigstar
 *
 */
public class UserDaoHandler implements InvocationHandler{

	private UserDaoI userImpl;

	public UserDaoHandler(UserDaoI userImpl) {
		this.userImpl = userImpl;
	}

	/**
     * 关联的这个实现类的方法被调用时将被执行
     * @param proxy 代理
     * @param method  原对象被调用的方法
     * @param args  方法的参数
     * @return  原方法的返回值
     * @throws Throwable
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		//这里可以扩展，增加一些查询之前需要执行的方法   
		System.out.println("动态代理--增加一些查询之前需要执行的方法");
		
		object = method.invoke(userImpl, args);
		
		//这里可以扩展，增加一些查询之后需要执行的方法
		System.out.println("动态代理--增加一些查询之后需要执行的方法");

		return object;

	}

}
