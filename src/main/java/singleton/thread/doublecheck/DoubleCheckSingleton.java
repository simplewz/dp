package singleton.thread.doublecheck;

/**
 * Description:双重检查锁线程安全的单例模式 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 16:37
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        if(null ==instance){
            synchronized (DoubleCheckSingleton.class){
                if(null == instance){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
