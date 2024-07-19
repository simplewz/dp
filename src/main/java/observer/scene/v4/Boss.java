package observer.scene.v4;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/18 9:20
 */
public class Boss implements BossStateSubject {

    //老板姓名
    private String name;

    //Boss状态
    private String bossState;

    //函数式接口实现事件处理
    private BossStateChangeEventHandler eventHandler;

    public Boss() {
    }

    public Boss(String name) {
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
        this.bossState = value;
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

    public void say(String word){
        System.out.println(word);
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", bossState='" + bossState + '\'' +
                '}';
    }
}
