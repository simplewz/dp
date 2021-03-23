package jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月23日
 */
public class ProxyHandler implements InvocationHandler{
	
	private Object object;
	
	public ProxyHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法调用前置处理");
		method.invoke(object, args);
		System.out.println("方法调用后置处理");
		return null;
	}
}
