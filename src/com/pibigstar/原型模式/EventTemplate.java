package com.pibigstar.原型模式;

public class EventTemplate {
	
	private String eventSubject;
	private String eventTail;
	
	public EventTemplate(String eventSubject, String eventTail) {
		this.eventSubject = eventSubject;
		this.eventTail = eventTail;
	}
	public String getEventSubject() {
		return eventSubject;
	}
	public void setEventContent(String eventSubject) {
		this.eventSubject = eventSubject;
	}
	public String getEventTail() {
		return eventTail;
	}
	public void setEventTail(String eventTail) {
		this.eventTail = eventTail;
	}
	
}
