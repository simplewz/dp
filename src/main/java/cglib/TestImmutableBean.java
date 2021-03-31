package cglib;

import net.sf.cglib.beans.ImmutableBean;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestImmutableBean {

	public static void main(String[] args) {
		SampleBean bean=new SampleBean("cglib");
		SampleBean immutableBean=(SampleBean)ImmutableBean.create(bean);
		System.out.println(bean.getValue());
		System.out.println(immutableBean.getValue());
		
		bean.setValue("changed value");
		System.out.println(bean.getValue());
		//不可直接调用不可变类的SetValue方法:java.lang.IllegalStateException: Bean is immutable
		immutableBean.setValue("changed immutable value");
		System.out.println(immutableBean.getValue());
	}

}
