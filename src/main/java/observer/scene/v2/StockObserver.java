package observer.scene.v2;

/**
 * Description: <br/>
 *  看股票的同事类：继承抽象父类Observer类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:26
 */
public class StockObserver extends Observer{

    //调用父类的构造方法
    public StockObserver(String name, Secretary secretary) {
        super(name, secretary);
    }

    //实现接收前台消息，更新自己的工作状态：关闭股票网页，继续工作
    @Override
    public void update() {
        System.out.println(String.format("%s,%s 关闭股票行情网页，继续工作！",secretary.getBossState(),name));
    }
}
