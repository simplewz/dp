package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestInvocationHandler {

	public static void main(String[] args) {
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(SampleClass.class);
		enhancer.setCallback(new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if(method.getDeclaringClass() != Object.class && method.getReturnType() == String.class){
	                return "hello cglib";
	            }else{
	                throw new RuntimeException("Do not know what to do");
	            }
			}
		});
		
		SampleClass proxy=(SampleClass)enhancer.create();
		System.out.println(proxy.test("test"));
		System.out.println(proxy.toString());
	}

}
