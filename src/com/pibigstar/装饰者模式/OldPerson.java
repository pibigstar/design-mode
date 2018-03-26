package com.pibigstar.装饰者模式;

/**
 * 被装饰对象
 * @author pibigstar
 *
 */
public class OldPerson implements Person{

	@Override
	public void eat() {
		System.out.println("吃饭");
	}

}
