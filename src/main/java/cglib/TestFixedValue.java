package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestFixedValue {

	public static void main(String[] args) {
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(SampleClass.class);
		enhancer.setCallback(new FixedValue() {
			//FixedValue用来对所有拦截的方法做相同的返回值
			@Override
			public Object loadObject() throws Exception {
				return "cglib";
			}
		});
		SampleClass proxy=(SampleClass)enhancer.create();
		System.out.println(proxy.test("null"));
		System.out.println(proxy.toString());
		System.out.println(proxy.getClass());
		System.out.println(proxy.hashCode());
	}
}
