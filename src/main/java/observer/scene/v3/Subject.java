package observer.scene.v3;

/**
 * Description: <br/>
 * 通知者接口
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:47
 */
public abstract class Subject {

    //boss状态
    protected String bossState;

    //增加通知者
    public abstract void attach(Observer observer);

    //减少通知者
   public abstract void detach(Observer observer);

    //通知
    public abstract void inform();

    //获取老板状态
    public String getBossState() {
        return bossState;
    }

    //设置老板状态
    public void setBossState(String bossState) {
        this.bossState = bossState;
    }
}
