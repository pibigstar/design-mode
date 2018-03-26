package com.pibigstar.装饰者模式;

/**
 * 装饰对象
 * @author pibigstar
 *
 */
public class NewPerson implements Person{

	private OldPerson old;
	public NewPerson(OldPerson old) {
		this.old = old;
	}


	@Override
	public void eat() {
		System.out.println("生火");
		System.out.println("做饭");
		old.eat();
		System.out.println("刷碗");
	}

}
