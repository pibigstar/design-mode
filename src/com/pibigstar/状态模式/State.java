package com.pibigstar.状态模式;
/**
 * 抽象状态类
 * @author pibigstar
 *
 */
public abstract class State {
	/** 
    * 状态行为抽象方法,由具体的状态子类去实现不同的行为逻辑 
    */  
	public abstract void Behavior();

}
