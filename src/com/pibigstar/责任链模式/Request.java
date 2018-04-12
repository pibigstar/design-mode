package com.pibigstar.责任链模式;

public class Request {
	Level level;
	
	public Request(Level level) {
		this.level = level;
	}
	
	public Level getLevel() {
		return level;
	}

}
