package observer.scene.v4;

/**
 * Description: <br/>
 * Boss状态主题类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:47
 */
public interface BossStateSubject {

    //通知
    public void inform();

    //获取主题状态
    public String getBossState();

    //设置主题状态
    public void setBossState(String state);

}
