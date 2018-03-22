package com.pibigstar.原型模式;

public class Test {

	public static void main(String[] args) {
		int i = 0;
		int MAX_COUNT = 10;
		EventTemplate et = new EventTemplate("邀请函主题（不变）", "婚嫁生日啥的....（不变部分）");
		Mail mail = new Mail(et);    
		while (i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setContent(i+"先生（女士）（变化部分）"+ mail.getTail());
			cloneMail.setReceiver("每个人的邮箱地址（变化部分）"+i);
			sendMail(cloneMail);
			i++;
		}
	}

	private static void sendMail(Mail cloneMail) {
		System.out.println(cloneMail);
	}
}
