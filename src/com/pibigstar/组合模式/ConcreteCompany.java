package com.pibigstar.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类，将实现Company的类组合起来
 * @author pibigstar
 *
 */
public class ConcreteCompany extends Company {  
	private List<Company> cList;  

	public ConcreteCompany() {  
		cList = new ArrayList<Company>();  
	}  

	public ConcreteCompany(String name) {  
		super(name);   
		cList = new ArrayList<Company>() ;   
	}  

	@Override  
	protected void add(Company company) {  
		cList.add(company);  
	}  

	/**
	 * 显示
	 */
	@Override  
	protected void display() {  
		System.out.println("-------"+this.getName()+"---------");
		for (Company c : cList) {  
			c.display();  
		}  

	}  

	@Override  
	protected void romove(Company company) {  
		cList.remove(company);  
	}  
}  