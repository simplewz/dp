package observer.scene.v3;

/**
 * Description: <br/>
 * 抽象观察者类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:58
 */
public abstract class Observer {

    protected String name;

    //由原来的具体前台通知类改为抽象通知接口类
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    //抽象更新状态方法
    public abstract void update();
}
