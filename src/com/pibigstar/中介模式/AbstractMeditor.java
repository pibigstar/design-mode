package com.pibigstar.中介模式;
/**
 * 中介者抽象类
 * @author pibigstar
 *
 */
public abstract class AbstractMeditor {
	protected AbstractColleague collA;
	protected AbstractColleague collB;
	
	public AbstractMeditor(AbstractColleague collA, AbstractColleague collB) {
		this.collA = collA;
		this.collB = collB;
	}
	
	 public abstract void AaffectB();  
     
	 public abstract void BaffectA();

}
