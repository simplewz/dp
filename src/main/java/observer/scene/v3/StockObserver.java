package observer.scene.v3;

/**
 * Description: <br/>
 * 股票观察着同事
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:05
 */
public class StockObserver extends Observer{

    //将原来的前台通知改为抽象的通知
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    //原来是前台状态，现改为抽象通知者状态
    @Override
    public void update() {
        System.out.println(String.format("%s,%s 关闭股票行情网页，继续工作！",subject.getBossState(),name));
    }
}
