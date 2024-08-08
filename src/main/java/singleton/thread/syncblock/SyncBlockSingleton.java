package singleton.thread.syncblock;

/**
 * Description: synchronized代码块的懒汉式单利<br/>
 * 解决了懒汉式单例模式多线程环境下的安全问题
 * 缺点：synchronized代码块，比synchronized方法锁力度小，运行效率高
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 16:20
 */
public class SyncBlockSingleton {

    private static SyncBlockSingleton instance;

    //构造方法私有化，外部不可调用new创建该类对象
    private SyncBlockSingleton(){

    }

    public static SyncBlockSingleton getInstance(){
        //synchronized代码块、在用到对象时才去创建类的单例对象
        synchronized (SyncBlockSingleton.class){
            if(null == instance){
                instance = new SyncBlockSingleton();
            }
        }
        return instance;
    }

}
