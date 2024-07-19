package observer.scene.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <br/>
 * 前台类：拥有需要通知查看股票同事的列表
 * boss来公司时，循环列表通知各同事，提醒同事boss到公司了，不要摸鱼了，要专心工作
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 14:41
 */
public class Secretary {

    //前台同事姓名
    private String name;

    //需要通知的查看股票同事的列表
    private List<StockObserver> observerList = new ArrayList<>();

    //老板的状态(需要发送的通知消息)
    private String bossState;

    public Secretary() {
    }

    public Secretary(String name) {
        this.name = name;
    }

    //有几个同事请前台帮忙，就给集合中添加几个对象
    public void attach(StockObserver observer){
        observerList.add(observer);
    }

    //老板来时，给所有登记的同事发送通知
    public void inform(){
        for(StockObserver observer:observerList){
            observer.update();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //获取老板状态
    public String getBossState() {
        return bossState;
    }

    //设置老板状态
    public void setBossState(String bossState) {
        this.bossState = bossState;
    }
}
