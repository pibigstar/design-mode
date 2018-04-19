package com.pibigstar.中介模式;
/**
 * 有两个类A和B，类中各有一个数字，
 * 并且要保证类B中的数字永远是类A中数字的2倍。
 * 也就是说，当修改类A的数时，将这个数字乘以2赋给类B，
 * 而修改类B时，要将数除以2赋给类A。类A类B互相影响，就称为同事类
 * @author pibigstar
 *
 */
public class Test {
	public static void main(String[] args) {
		
		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();
		
		AbstractMeditor meditor = new Mediator(collA, collB);
		
		System.out.println("========设置A影响B========");
		collA.setNumber(15, meditor);
		System.out.println("collA的number的值："+collA.getNumber());
		System.out.println("collB的number的值："+collB.getNumber());
		
		System.out.println("========设置B影响A========");
		collB.setNumber(80, meditor);
		System.out.println("collA的number的值："+collA.getNumber());
		System.out.println("collB的number的值："+collB.getNumber());
		
		
		
	}

}
