package com.pibigstar.组合模式;

/**
 * 财务部
 * @author pibigstar
 *
 */
public class FinanceDepartment extends Company {  

	public FinanceDepartment(){}  

	public FinanceDepartment(String name){  
		super(name);  
	}  

	@Override  
	protected void add(Company company) {  

	}  

	@Override  
	protected void display() {  
		System.out.println(this.getName() ) ;   
	}  

	@Override  
	protected void romove(Company company) {  

	}  

}  
