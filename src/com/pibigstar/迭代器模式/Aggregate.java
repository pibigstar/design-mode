package com.pibigstar.迭代器模式;
/**
 * 抽象容器：一般是一个接口，提供一个iterator()方法，
 * 例如java中的Collection接口，List接口，Set接口等。
 * @author pibigstar
 *
 */
public interface Aggregate {
	
	public void add(Object obj);
	public void remove(Object obj);
	public Iterator iterator();

}
