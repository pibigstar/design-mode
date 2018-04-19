package com.pibigstar.中介模式;
/**
 * 具体同事A
 * @author pibigstar
 *
 */
public class ColleagueA extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractMeditor coll) {
		this.number = number;  
		coll.AaffectB();  
	}  

}
