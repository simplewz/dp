package singleton.thread.syncmethod;


/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 16:14
 */
public class TestLazySyncMethodSingletonThread extends Thread{

    @Override
    public void run() {
        System.out.println(SyncMethodSingleton.getInstance());
    }
}
