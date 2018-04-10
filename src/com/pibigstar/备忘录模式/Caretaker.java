package com.pibigstar.备忘录模式;

import java.util.HashMap;
import java.util.Map;
/**
 * 管理角色：对备忘录进行管理，保存和提供备忘录。
 * @author pibigstar
 *
 */
public class Caretaker {

	private Map<String, Memento> memMap = new HashMap<String, Memento>();  
	public Memento getMemento(String index){  
		return memMap.get(index);  
	}  

	public void setMemento(String index, Memento memento){  
		this.memMap.put(index, memento);  
	}  

}
