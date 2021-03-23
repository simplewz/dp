package jdk.proxy;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月23日
 */
public class RealSubjectPlus implements Subject{

	@Override
	public void request() {
		System.out.println("具体实现类实现具体的请求方法增强版");
	}

}
