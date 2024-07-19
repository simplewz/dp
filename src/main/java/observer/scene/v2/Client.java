package observer.scene.v2;

/**
 * Description: <br/>
 * 客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:38
 */
public class Client {

    public static void main(String[] args) {
        //前台同事童子喆
        Secretary secretary = new Secretary("童子喆");
        //看股票和观看NBA的同事
        Observer stockObserver1 = new StockObserver("魏关哲",secretary);
        Observer stockObserver2 = new StockObserver("易管查",secretary);
        Observer nbaObserver3 = new NbaObserver("梁年办",secretary);

        //前台记录了老板来时需要通知的同事
        secretary.attach(stockObserver1);
        secretary.attach(stockObserver2);
        secretary.attach(nbaObserver3);

        //发现老板回来了
        secretary.setBossState("老板回来了");

        //通知同事
        secretary.inform();
    }
}
