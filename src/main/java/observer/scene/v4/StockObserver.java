package observer.scene.v4;

/**
 * Description: <br/>
 * 股票观察着同事，移除了继承抽象观察者类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:05
 */
public class StockObserver{

    //姓名
    private String name;

    //员工自己的工作状态
    private String workState;

    //保存的老板状态的信息
    private String bossState;

    //订阅的主题
    private BossStateSubject subject;

    //构造方法
    public StockObserver(String name) {
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

    public void closeStockMarket(){
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
        return "StockObserver{" +
                "name='" + name + '\'' +
                ", workState='" + workState + '\'' +
                ", bossState='" + bossState + '\'' +
                '}';
    }
}
