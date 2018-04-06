package com.pibigstar.访问者模式;

import java.util.List;

/**
 * 元素类中需要封装在访问者中的操作必定是与元素类本身关系不大且是易变的操作
 * 扩展性良好：元素类可以通过接受不同的访问者来实现对不同操作的扩展。
 * @author pibigstar
 *
 */
public class Test {

	public static void main(String[] args) {
		List<Element> list = ObjectStruture.getList();  
		for(Element e: list){  
			e.accept(new Visitor());  
		}  
	}
}
