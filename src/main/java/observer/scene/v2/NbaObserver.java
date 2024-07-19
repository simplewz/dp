package observer.scene.v2;

/**
 * Description: <br/>
 * 观看NBA直播的同事类，继承抽象父类Observer类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:32
 */
public class NbaObserver extends Observer{

    public NbaObserver(String name, Secretary secretary) {
        super(name, secretary);
    }

    //实现接收前台消息，更新自己的工作状态：关闭NBA直播，继续工作
    @Override
    public void update() {
        System.out.println(String.format("%s,%s 关闭NBA直播，继续工作！",secretary.getBossState(),name));
    }
}
