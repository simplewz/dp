package cglib;

import java.lang.reflect.Method;

import net.sf.cglib.beans.BeanGenerator;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestGenerator {

	public static void main(String[] args) throws Exception {
		BeanGenerator generator=new BeanGenerator();
		generator.addProperty("name", String.class);
		Object bean=generator.create();
		Method setter=bean.getClass().getMethod("setName", String.class);
		setter.invoke(bean, "simple");
		Method getter=bean.getClass().getMethod("getName", null);
		System.out.println(getter.invoke(bean, null));
		
		Method toString=bean.getClass().getMethod("toString", null);
		System.out.println(toString.invoke(bean, null));
	}

}
