package com.pibigstar.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器实现：实现迭代器接口中定义的方法，完成集合的迭代。
 * @author pibigstar
 *
 */
public class ConcreteIterator implements Iterator{

	private List<Object> list = new ArrayList<>();
	private int cursor = 0;
	
	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	@Override
	public Object next() {
		Object obj  = null;
		if (this.hasNext()) {
			obj = this.list.get(cursor);
			cursor++;
		}
		return obj;
	}

	@Override
	public boolean hasNext() {
		if (cursor==list.size()) {
			return false;
		}
		return true;
	}

}
