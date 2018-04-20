package com.pibigstar.状态模式;
/**
 * 环境,上下文类
 * 拥有状态对象，且可以完成状态间的转换 [状态的改变/切换 在环境类中实现] 
 * @author pibigstar
 *
 */
public class Context {
	 // 维护一个抽象状态对象的引用  
	private State state;
	/**
	 * 模拟手机的话费属性<br/> 
	 * 环境状态如下： 
	 * 1>、当  bill >= 0.00$ : 状态正常   还能拨打电话  
	 * 2>、当  bill < 0.00$ : 手机欠费   不能拨打电话 
	 */  
	private double bill;
	
	public void Handle() {
		checkState();
		state.Behavior();
	}

	/** 
	 * 检查环境状态:状态的改变/切换 在环境类中实现 
	 */  
	private void checkState() {
		if (bill>=0.00) {
			setState(new ConcreteStateA());
		}else {
			setState(new ConcreteStateB());
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}
	

}
