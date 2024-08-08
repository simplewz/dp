package singleton.hungry;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 16:12
 */
public class TestHungrySingletonThread extends Thread{

    @Override
    public void run() {
        System.out.println(HungrySingleton.getInstance());
    }

}
