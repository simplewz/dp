package proxy.cglib;

import net.sf.cglib.beans.BeanCopier;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestBeanCopier {
	
	public static void main(String[] args) {
		//将一个bean复制到另一个bean
		BeanCopier beanCopier=BeanCopier.create(SampleBean.class, OtherSampleBean.class, false);
		SampleBean sampleBean=new SampleBean("sample bean");
		OtherSampleBean otherSampleBean=new OtherSampleBean();
		System.out.println(sampleBean);
		System.out.println(otherSampleBean);
		beanCopier.copy(sampleBean, otherSampleBean, null);
		System.out.println(sampleBean);
		System.out.println(otherSampleBean);
	}
	
}
