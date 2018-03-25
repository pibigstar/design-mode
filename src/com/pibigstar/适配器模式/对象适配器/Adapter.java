package com.pibigstar.适配器模式.对象适配器;

/**
 * 适配器类关联已有的Adaptee类，并且实现标准接口，这样做的好处是不再需要继承。
 * @author pibigstar
 *
 */
public class Adapter implements Target{
	
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void add() {
		this.adaptee.add();
	}

	@Override
	public void queryAndAdd() {
		System.out.println("查询之后然后添加。。。");
	}
	
	

}
