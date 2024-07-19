package observer.scene.v1;

/**
 * Description:客户端类 <br/>
 * 前台类和看股票的类之间互相耦合：前台类需要增加观察者、观察者类需要前台的Boss的状态
 * 如果观察者者中有人看NBA，前台通知不到，需要修改代码，违反了开放封闭原则和依赖倒转原则
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 14:59
 */
public class Client {

    public static void main(String[] args) {
        //前台同事童子喆
        Secretary secretary = new Secretary("童子喆");
        //看股票的同事
        StockObserver stockObserver1 = new StockObserver("魏关哲",secretary);
        StockObserver stockObserver2 = new StockObserver("易管查",secretary);

        //前台记录了老板来时需要通知的两位同事
        secretary.attach(stockObserver1);
        secretary.attach(stockObserver2);

        //发现老板回来了
        secretary.setBossState("老板回来了");

        //通知两个同事
        secretary.inform();
    }

}
