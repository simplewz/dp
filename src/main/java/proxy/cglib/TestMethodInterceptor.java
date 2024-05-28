package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestMethodInterceptor {
	
	public static void main(String[] args) {
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(SampleClass.class);
		//cglib方法拦截器，可在拦截器中实现对方法的增强处理
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
				System.out.println("before method invoke");
				Object result=proxy.invokeSuper(obj, args);
				System.out.println("after method invoded");
				return result;
			}
		});
		SampleClass sampleClass=(SampleClass) enhancer.create();
		sampleClass.test("测试参数");
	}
	
}
