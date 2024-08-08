package singleton.thread.syncmethod;

/**
 * Description: synchronized方法的懒汉式单利<br/>
 * 解决了懒汉式单例模式多线程环境下的安全问题
 * 缺点：synchronized作用在方法上，锁粒度大，运行效率低
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 16:20
 */
public class SyncMethodSingleton {

    private static SyncMethodSingleton instance;

    //构造方法私有化，外部不可调用new创建该类对象
    private SyncMethodSingleton(){

    }

    //synchronized方法
    public static synchronized SyncMethodSingleton getInstance(){
        //在用到对象时才去创建类的单例对象
        if(null == instance){
            instance = new SyncMethodSingleton();
        }
        return instance;
    }

}
