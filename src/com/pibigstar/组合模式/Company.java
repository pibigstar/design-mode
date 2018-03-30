package com.pibigstar.组合模式;

/**
 * 公司接口
 * @author pibigstar
 *
 */
public abstract class Company {  
    private String name;  
  
    public Company(String name) {  
        this.name = name;  
    }  
  
    public Company() {  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    protected abstract void add(Company company);  
  
    protected abstract void romove(Company company);  
  
    protected abstract void display();  
} 
