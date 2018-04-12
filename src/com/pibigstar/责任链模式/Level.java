package com.pibigstar.责任链模式;

/**
 * 条件类：
 * 只有处理类的处理等级高于Request的等级才能处理，否则交给下一个处理者处理。
 * @author pibigstar
 *
 */
public class Level {

	private int level = 0;  
	public Level(int level){  
		this.level = level;  
	};  

	public boolean above(Level level){  
		if(this.level >= level.level){  
			return true;  
		}  
		return false;  
	} 

}
