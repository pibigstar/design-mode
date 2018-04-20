package com.pibigstar.状态模式;
/**
 * 具体状态子类B
 * @author pibigstar
 *
 */
public class ConcreteStateB extends State{

	@Override
	public void Behavior() {
		System.out.println("手机在欠费停机状态下, 不能拨打电话");
	}

}
