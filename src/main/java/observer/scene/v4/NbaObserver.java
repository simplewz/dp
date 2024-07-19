package observer.scene.v4;

/**
 * Description: <br/>
 * NBA直播观看者同事，移除了继承抽象观察者
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:09
 */
public class NbaObserver{

    private String name;

    private String bossState;

    private String workState;

    private BossStateSubject subject;

    public NbaObserver() {
    }

    public NbaObserver(String name) {
        this.name = name;
    }

    //订阅老板状态主题，获取老板状态
    public void subBossStateSubject(BossStateSubject subject){
        this.subject = subject;
        this.bossState = subject.getBossState();
    }

    //获取当前自己保存的老板的状态信息
    public String getBossState() {
        return bossState;
    }

    //设置老板的状态信息
    public void setBossState(String bossState) {
        this.bossState = bossState;
    }

    //关闭NBA直播
    public void closeNBADirectSeeding() {
        System.out.println(String.format("%s,%s 关闭股票行情网页，继续工作！",subject.getBossState(),name));
    }

    public void say(String word){
        System.out.println(word);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }

    @Override
    public String toString() {
        return "NbaObserver{" +
                "name='" + name + '\'' +
                ", workState='" + workState + '\'' +
                ", bossState='" + bossState + '\'' +
                '}';
    }
}
