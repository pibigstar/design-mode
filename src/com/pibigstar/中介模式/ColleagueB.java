package com.pibigstar.中介模式;
/**
 * 具体同事B
 * @author pibigstar
 *
 */
public class ColleagueB extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractMeditor coll) {
		this.number = number;  
		coll.BaffectA();  
	}  
}
