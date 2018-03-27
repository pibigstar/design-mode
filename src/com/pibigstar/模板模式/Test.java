package com.pibigstar.模板模式;

/**
 * 把容易变化的部分定义为抽象的方法由子类去完成，而不变的部分让父类去完成
 * @author pibigstar
 *
 */
public class Test {
	
	public static int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 }; 
	
	public static void main(String[] args){  
		AbstractSort s = new ConcreteSort();  
		s.showResult(a); 
	}  

}
