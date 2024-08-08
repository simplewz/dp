package singleton.stat;

/**
 * Description: 静态初始化线程安全的单例模式<br/>
 * 类上使用final修饰，防止类被继承
 * 静态成员变量上使用final修饰，防止成员变量被修改
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 15:04
 */
public final class StaticSingleton {

    //提供一个静态本类的对象成员变量
    private final static StaticSingleton instance = new StaticSingleton();

    //构造方法私有化，外部不可调用new创建该类对象
    private StaticSingleton(){

    }

    //提供一个获取本类对象的唯一全局访问点，在其中可以调用私有的构造方法创建本类的对象，并控制只能创建一个
    public static StaticSingleton getInstance(){
        return instance;
    }

}
