package cglib;

/**
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月31日
 */
public class OtherSampleBean {

	private String value;
	
	public OtherSampleBean() {
		
	}

	public OtherSampleBean(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "OtherSampleBean [value=" + value + "]";
	}
}
