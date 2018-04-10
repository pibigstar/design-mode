package com.pibigstar.备忘录模式;

import java.util.Map;
/**
 * 备忘录：负责存储发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
 * @author pibigstar
 *
 */
public class Memento {

	private Map<String, Object> stateMap;  

	public Memento(Map<String, Object> map){  
		this.stateMap = map;  
	}  

	public Map<String, Object> getStateMap() {  
		return stateMap;  
	}  

	public void setStateMap(Map<String, Object> stateMap) {  
		this.stateMap = stateMap;  
	}  

}
