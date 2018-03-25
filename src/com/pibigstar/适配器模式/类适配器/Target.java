package com.pibigstar.适配器模式.类适配器;

/**
 * 目标(Target)角色：这就是所期待得到的接口。
 * 注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
 * @author pibigstar
 */
public interface Target {
 
	/**
	 * 这是源类Adaptee也有的方法
	 */
	public void add(); 
	
	/**
	 * 这是源类Adapteee没有的方法
	 */
	public void queryAndAdd(); 


}
