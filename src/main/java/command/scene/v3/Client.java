package command.scene.v3;

/**
 * Description:客户端类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 16:21
 */
public class Client {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer("后厨1");
        Command bakeMuttonCommand1 = new BakeMuttonCommand(barbecuer);
        bakeMuttonCommand1.setName("羊肉串");
        bakeMuttonCommand1.setCount(10);
        bakeMuttonCommand1.setPrice(10);

        Command bakeMuttonCommand2 = new BakeMuttonCommand(barbecuer);
        bakeMuttonCommand2.setName("羊肉串");
        bakeMuttonCommand2.setCount(5);
        bakeMuttonCommand2.setPrice(10);

        Command bakeMuttonCommand3 = new BakeChickenWingCommand(barbecuer);
        bakeMuttonCommand3.setName("鸡翅");
        bakeMuttonCommand3.setCount(5);
        bakeMuttonCommand3.setPrice(15);

        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeMuttonCommand2);
        waiter.setOrder(bakeMuttonCommand3);

        //waiter.cancelOrder(bakeMuttonCommand2);

        waiter.notifyBake();

        waiter.checkout();

    }
}
