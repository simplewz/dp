package singleton.thread.syncblock;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 16:08
 */
public class Test {

    public static void main(String[] args) {
        Thread[] threads = new Thread[20];
        for(int i=0;i<threads.length;i++){
            threads[i] = new TestLazySyncBlockSingletonThread();
        }

        for(int i=0;i<threads.length;i++){
            threads[i].start();
        }
    }
}
