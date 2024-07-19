package observer.scene.v4;

/**
 * Description: <br/>
 * 前台类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/18 9:20
 */
public class Secretary implements BossStateSubject {

    private String name;

    //Boss状态
    private String bossState;

    //函数式接口实现事件处理
    private BossStateChangeEventHandler eventHandler;

    public Secretary() {
    }

    public Secretary(String name) {
        this.name = name;
    }

    @Override
    public void inform() {
        eventHandler.updateState();
    }

    @Override
    public String getBossState() {
        return bossState;
    }

    @Override
    public void setBossState(String value) {
        bossState = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BossStateChangeEventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(BossStateChangeEventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + name + '\'' +
                ", bossState='" + bossState + '\'' +
                '}';
    }
}
