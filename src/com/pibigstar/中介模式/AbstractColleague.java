package com.pibigstar.中介模式;

/**
 * 抽象同事类
 * @author pibigstar
 *
 */
public abstract class AbstractColleague {
	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	 //抽象方法，修改数字时同时修改关联对象  
	public abstract void setNumber(int number,AbstractMeditor coll);

}
