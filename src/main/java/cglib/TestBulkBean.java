package cglib;

import net.sf.cglib.beans.BulkBean;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class TestBulkBean {

	public static void main(String[] args) {
		BulkBean bulkBean=BulkBean.create(SampleBean.class, new String[] {"getValue"}, new String[] {"setValue"}, new Class[] {String.class});
		SampleBean bean=new SampleBean("cglib");
		Object[] propertyValues=bulkBean.getPropertyValues(bean);
		System.out.println(propertyValues.length);
		System.out.println(propertyValues[0]);
		bulkBean.setPropertyValues(bean, new Object[] {"test"});
		System.out.println(bean.getValue());
	}

}
