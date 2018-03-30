package com.pibigstar.组合模式;

/**
 * 人力资源部
 * @author pibigstar
 *
 */
public class HRDepartment extends Company {  


	public HRDepartment(){  

	}  

	public HRDepartment(String name){  
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
