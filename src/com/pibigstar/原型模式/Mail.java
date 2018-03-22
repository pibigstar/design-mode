package com.pibigstar.原型模式;

/**
 *	例如，对于拿邮件发邀请函，邮件类大部分内容都是一样的：
 *	邀请原由、相邀地点，相聚时间等等，但对于被邀请者的名称和发送的邮件地址是不同的。
 * @author pibigstar
 *
 */
public class Mail implements Cloneable{

	private String receiver;//接收人邮箱
	private String subject;//邀请函主题
	private String content;//邀请函内容（XX先生欢迎你）
	private String tail;//邀请函内容（具体什么事宜） 


	public Mail(EventTemplate et) {
		//这两个是不变的部分
		this.subject = et.getEventSubject();
		this.tail = et.getEventTail();
	}


	@Override
	protected Mail clone(){
		Mail mail = null;        
		try {
			mail = (Mail) super.clone();            
		} catch (CloneNotSupportedException e) {            
			e.printStackTrace();
		} 
		return mail;
	}


	public String getReceiver() {
		return receiver;
	}


	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getTail() {
		return tail;
	}


	public void setTail(String tail) {
		this.tail = tail;
	}


	@Override
	public String toString() {
		return "Mail [receiver=" + receiver + ", subject=" + subject + ", content=" + content + "]";
	}

}
