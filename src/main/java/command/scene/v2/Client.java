package command.scene.v2;

/**
 * Description: 客户端类<br/>
 *
 * 存在的问题：
 *  1.程序是服务员接受一个用户点菜需求，就通知一次后厨开始烤串
 *  2.顾客要点的菜如果没有，顾客并不知情，而是应该由服务员告诉顾客你点的这个菜没有了
 *  3.顾客点了哪些东西，是需要记录的，方便在结账时作为收费依据
 *  4.顾客如果觉得点菜点的太多了，需要取消一些没有制作的点单项，这里不支持修改
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:26
 */
public class Client {

    public static void main(String[] args) {

        Barbecuer barbecuer = new Barbecuer();

        Command bakeMuttonCommand1 = new BakeMuttonCommand(barbecuer);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(barbecuer);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);

        //服务员接受顾客烤串菜单，并通知后厨烤串
        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMuttonCommand1);
        waiter.notifyBake();

        waiter.setOrder(bakeMuttonCommand2);
        waiter.notifyBake();

        waiter.setOrder(bakeChickenWingCommand);
        waiter.notifyBake();

    }

}
