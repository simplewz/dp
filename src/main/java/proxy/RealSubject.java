package proxy;

/**
 * 继承抽象类/实现接口的真正实现类
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月23日
 */
public class RealSubject extends Subject{

	/**
	 * 具体实现类实现抽象类/接口中的抽象请求方法
	 */
	@Override
	public void request() {
		System.out.println("具体实现类实现具体的请求方法");
	}
}
