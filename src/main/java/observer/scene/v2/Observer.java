package observer.scene.v2;

/**
 * Description: <br/>
 * 抽象观察者类:
 *      将观看股票、看NBA的同事的公共属性name做了封装、
 *      以及需要更新状态的方法进行了抽象，具体实现由子类去实现(看股票的同事需要关闭网页、看NBA的同事需要关闭NBA直播)
 *  观察着类中的Secretary secretary是具体的类，也应该抽象出来，当通知的不是前台，而是老板自己时，也可以
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:21
 */
public abstract class Observer {

    protected String name;

    protected Secretary secretary;

    public Observer(String name, Secretary secretary) {
        this.name = name;
        this.secretary = secretary;
    }

    //公共的更新状态的方法，具体实现由子类去实现(看股票的同事需要关闭网页、看NBA的同事需要关闭NBA直播)
    public abstract void update();
}
