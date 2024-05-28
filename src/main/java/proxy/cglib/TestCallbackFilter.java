package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackHelper;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.NoOp;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestCallbackFilter {

	public static void main(String[] args) {
		Enhancer enhancer=new Enhancer();
		//过滤满足要求的方法，只对满足过滤条件的方法进行处理
		CallbackHelper callbackHelper=new CallbackHelper(SampleClass.class,null) {
			@Override
			protected Object getCallback(Method method) {
				if(method.getDeclaringClass()!=Object.class && method.getReturnType()==String.class) {
					return new FixedValue() {
						@Override
						public Object loadObject() throws Exception {
							return "proxy/cglib";
						}
					};
				}else {
					return NoOp.INSTANCE;
				}
			}
		};
		enhancer.setSuperclass(SampleClass.class);
		enhancer.setCallbackFilter(callbackHelper);
		enhancer.setCallbacks(callbackHelper.getCallbacks());
		SampleClass proxy=(SampleClass) enhancer.create();
		System.out.println(proxy.test("proxy/cglib"));
		System.out.println(proxy.toString());
		System.out.println(proxy.hashCode());
	}

}
