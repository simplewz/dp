package cglib;

import java.lang.reflect.Method;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestBeanMap {

	public static void main(String[] args) throws Exception {
		BeanGenerator generator=new BeanGenerator();
		generator.addProperty("username", String.class);
		generator.addProperty("age", Integer.class);
		Object bean=generator.create();
		Method setUsername=bean.getClass().getMethod("setUsername", new Class[] {String.class});
		setUsername.invoke(bean, "simple");
		Method setAge=bean.getClass().getMethod("setAge", Integer.class);
		setAge.invoke(bean, 25);
		
		
		SampleBean sampleBean=new SampleBean("test");
		//使用BeanMap将对象转换为Map
		BeanMap beanMap=BeanMap.create(sampleBean);
		System.out.println(beanMap.get("value"));
		//System.out.println(beanMap.get("age"));
	}

}
