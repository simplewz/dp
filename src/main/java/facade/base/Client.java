package facade.base;

/**
 * 客户端类:由于Facade的作用，客户端可以根部不知道子系统的存在
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/27 8:57
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

}
