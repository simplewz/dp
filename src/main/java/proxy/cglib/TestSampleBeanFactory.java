package proxy.cglib;

import net.sf.cglib.core.KeyFactory;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestSampleBeanFactory {

	public static void main(String[] args) {
		SampleBeanFactory sampleBeanFactory=(SampleBeanFactory)KeyFactory.create(SampleBeanFactory.class);
		Object bean = sampleBeanFactory.newInstance("simple", 25);
		System.out.println(bean);
	}

}
