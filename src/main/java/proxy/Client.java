package proxy;

/**
 * 客户端类
 * @author simple
 * @email 13132398914@163.com
 * @date 2021年3月23日
 */
public class Client {

	public static void main(String[] args) {
		RealSubject realSubject=new RealSubject();
		Proxy proxy=new Proxy(realSubject);
		proxy.request();
	}

}
