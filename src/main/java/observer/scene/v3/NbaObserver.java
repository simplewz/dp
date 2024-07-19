package observer.scene.v3;

/**
 * Description: <br/>
 * NBA直播观看者同事
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:09
 */
public class NbaObserver extends Observer{

    public NbaObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s,%s 关闭NBA直播，继续工作！",subject.getBossState(),name));
    }
}
