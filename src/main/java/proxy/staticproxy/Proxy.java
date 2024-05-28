package proxy.staticproxy;

/**
 * 代理类，同样需要继承抽象父类/实现接口
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月23日
 */
public class Proxy extends Subject{
	
	//代理类需要持有被代理对象的引用
	private RealSubject realSubject;

	//代理对象的构造方法，在创建代理对象时，需要传入被代理对象的引用
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	//调用代理对象的方法实现抽象父类/接口中需要实现的方法
	@Override
	public void request() {
		if(null==realSubject) {
			System.out.println("被代理对象不能为空");
			return; 
		}
		System.out.println("请求方法前置增强");
		realSubject.request();
		System.out.println("请求方法后置处理");
	}

	public RealSubject getRealSubject() {
		return realSubject;
	}

	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
}
