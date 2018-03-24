package com.pibigstar.生成器模式;

/**
 * 抽象者建造者
 * @author pibigstar
 *
 */
public abstract class Builder {
	//创建产品对象
    protected Product product=new Product();
   
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
   
    //返回产品对象
    public abstract Product getProduct();
	
}
