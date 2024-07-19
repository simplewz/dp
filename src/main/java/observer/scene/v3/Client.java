package observer.scene.v3;

/**
 * Description: <br/>
 * 客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:15
 */
public class Client {

    public static void main(String[] args) {
        Subject boss = new Boss("胡汉三");
        Observer stockObserver1 = new StockObserver("魏关哲",boss);
        Observer stockObserver2 = new StockObserver("易管查",boss);
        Observer nbaObserver3 = new NbaObserver("梁年办",boss);

        boss.attach(stockObserver1);
        boss.attach(stockObserver2);
        boss.attach(nbaObserver3);

        boss.detach(stockObserver1);

        boss.setBossState("我胡汉三又回来了");

        boss.inform();

        Secretary secretary = new Secretary("童子喆");
        stockObserver1.subject = secretary;
        stockObserver2.subject = secretary;
        nbaObserver3.subject = secretary;
        secretary.attach(stockObserver1);
        secretary.attach(stockObserver2);
        secretary.attach(nbaObserver3);

        secretary.detach(stockObserver2);

        secretary.setBossState("胡汉三回来了");
        secretary.inform();
    }

}
