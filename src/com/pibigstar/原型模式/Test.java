package com.pibigstar.原型模式;
/**
 * 实现：
实现Cloneable接口：
        Cloneable接口的作用是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。

重写Object类中的clone方法：
        Java中，所有类的父类都是Object类，Object类中有一个clone方法，作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，因此，原型类需要将clone方法的作用域修改为public类型。
 * @author pibigstar
 *
 */
public class Test {

	public static void main(String[] args) {
		int i = 0;
		int MAX_COUNT = 10;
		EventTemplate et = new EventTemplate("邀请函主题（不变）", "婚嫁生日啥的....（不变部分）");
		Mail mail = new Mail(et);    
		while (i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setReceiver("每个人的邮箱地址（变化部分）"+i);
			cloneMail.setContent(i+"先生（女士）（变化部分）"+ mail.getTail());
			sendMail(cloneMail);
			i++;
		}
	}

	private static void sendMail(Mail cloneMail) {
		System.out.println(cloneMail);
	}
}
