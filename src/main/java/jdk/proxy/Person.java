package jdk.proxy;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月23日
 */
public class Person implements Action{

	@Override
	public void walk() {
		System.out.println("Person:walk()方法");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Person:Hello "+name);
	}
	
}
