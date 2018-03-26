package com.pibigstar.装饰者模式;
/**
 * 没有改变原来的OldPerson类，同时也没有定义他的子类而实现了Person的扩展
 * @author pibigstar
 *
 */
public class Test {
	/**
	 * 优点：
        1，使用装饰者模式比使用继承更加灵活，因为它选择通过一种动态的方式来扩展一个对象的功能，在运行时可以选择不同的装饰器，从而实现不同的行为。
        2，通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合。可以使用多个具体装饰类来装饰同一对象，得到功能更为强大的对象。
        3，具体构件类与具体装饰类可以独立变化，他能是低耦合的。用户可以根据需要来增加新的具体构件类和具体装饰类，在使用时再对其进行各种组合，原有代码无须改变，符合“开闭原则”。
	 * @param args
	 */
	public static void main(String[] args) {
		OldPerson old = new OldPerson();
		NewPerson newPerson = new NewPerson(old);
		newPerson.eat();
	}

}

