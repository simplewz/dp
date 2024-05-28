package proxy.jdkproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月23日
 */
public class Client {

	public static void main(String[] args) throws Exception{
		System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Subject subject=null;
		ProxyHandler handler =null;
		
		RealSubject realSubject=new RealSubject();
		handler=new ProxyHandler(realSubject);
		subject=(Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, handler);
		subject.request();
		
		System.out.println("====================");
		
		RealSubjectPlus realSubjectPlus=new RealSubjectPlus();
		handler=new ProxyHandler(realSubjectPlus);
		subject=(Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, handler);
		subject.request();
		
		//动态代理对象的具体生成过程
		System.out.println("====================");
		//被代理的对象
		Person person=new Person();
		//代理调度处理器,需要传入被代理的对象
		handler=new ProxyHandler(person);
		//动态代理类
		Class proxyClass=Proxy.getProxyClass(Action.class.getClassLoader(), new Class[] {Action.class});
		//动态代理的类的构造器
		Constructor<Action> constructor=proxyClass.getConstructor(new Class[] {InvocationHandler.class});
		//调用动态代理的构造器创建代理对象,需要传入代理处理调度器
		Action action=constructor.newInstance(handler);
		//通过代理对象调用方法
		action.walk();
		action.sayHello("simple");
		
		//获取动态代理对象的调度处理器InvocationHandler
		InvocationHandler handler2 =Proxy.getInvocationHandler(action);
		System.out.println(handler==handler2);
	}
}
