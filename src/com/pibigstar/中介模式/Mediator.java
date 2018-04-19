package com.pibigstar.中介模式;

/**
 * 具体中介者类
 * @author pibigstar
 *
 */
public class Mediator extends AbstractMeditor{
	
	public Mediator(AbstractColleague collA, AbstractColleague collB) {
		super(collA, collB);
	}

	//处理A对B的影响  
	@Override
	public void AaffectB() {
		int number = collA.getNumber();
		collB.setNumber(number*2);
	}
	//处理B对A的影响  
	@Override
	public void BaffectA() {
		int number = collB.getNumber();
		collA.setNumber(number/2);
	}

}
