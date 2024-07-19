package observer.base;

/**
 * Description: <br/>
 * 抽象观察者：为所有的具体观察者定义一个接口，在得到主题的通知时更新自己的状态信息
 * 抽象观察者一般用一个抽象类或一个接口实现，包含一个更新方法
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:32
 */
public abstract class Observer {

    //更新方法
    public abstract void update();

}
