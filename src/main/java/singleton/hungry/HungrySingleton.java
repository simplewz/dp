package singleton.hungry;

/**
 * Description: 饿汉式单例模式<br/>
 *
 *  饿汉式单利模式：在类加载时就创建好该类的单例对象（立即加载）
 *  优点：单线程和多线程环境下都是线程安全的
 *  缺点：在类加载时就占用内存
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 15:04
 */
public class HungrySingleton {

    //提供一个静态本类的对象成员变量
    private static HungrySingleton instance = new HungrySingleton();

    //构造方法私有化，外部不可调用new创建该类对象
    private HungrySingleton(){

    }

    //提供一个获取本类对象的唯一全局访问点，在其中可以调用私有的构造方法创建本类的对象，并控制只能创建一个
    public static HungrySingleton getInstance(){
        return instance;
    }

}
