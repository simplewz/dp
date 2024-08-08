package singleton.lazy;

/**
 * Description: 懒汉式单例模式<br/>
 *
 *  懒汉式单利模式：在用到对象时才去创建类的单例对象（延迟加载）
 *  优点:节省内存
 *  缺点：在多线程环境下不是安全的
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 15:04
 */
public class LazySingleton {

    //提供一个静态本类的对象成员变量
    private static LazySingleton instance;

    //构造方法私有化，外部不可调用new创建该类对象
    private LazySingleton(){

    }

    //提供一个获取本类对象的唯一全局访问点，在其中可以调用私有的构造方法创建本类的对象，并控制只能创建一个
    public static LazySingleton getInstance(){
        //在用到对象时才去创建类的单例对象
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }

}
