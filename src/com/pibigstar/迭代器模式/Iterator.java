package com.pibigstar.迭代器模式;
/**
 * 抽象迭代器：定义遍历元素所需要的方法
 * @author pibigstar
 *
 */
public interface Iterator {
	public Object next();
	public boolean hasNext();

}
