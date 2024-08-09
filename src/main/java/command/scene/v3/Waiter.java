package command.scene.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 改进后的服务员类<br/>
 *  1.接待顾客
 *  2.负责记录顾客的点单项，若店里面没有顾客需要的菜品，需要告知顾客您点的菜没有了
 *  3.待顾客下单完成后，一次性通知后厨制作顾客点单
 *  4.可根据顾客的点单项取消没有制作的菜品
 *  5.根据顾客点单项进行结账
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:36
 */
public class Waiter {

    //用于记录顾客的点单需求
    private List<Command> orderList = new ArrayList<>();

    //接受顾客点单，若顾客的点单没有了，告知顾客，详细记录顾客的点单（名称、数量）
    public void setOrder(Command command){
        String name = command.getName();
        if(!(name.equals("羊肉串")||name.equals("鸡翅"))){
            System.out.println("对不起，您点的菜品没了");
        }else {
            orderList.add(command);
        }
    }

    //取消订单
    public void cancelOrder(Command command){
        orderList.remove(command);
    }

    //通知后厨烤串
    public void notifyBake(){
        for (Command command:orderList) {
            command.bake(command.getCount());
        }
    }

    //结账
    public void checkout(){
        int amount = 0;
        System.out.println("收费明细：");
        for(int i=0;i<orderList.size();i++){
            Command order = orderList.get(i);
            System.out.println(String.format("%s.菜名：%s 数量：%s,单价：%s",i+1,order.getName(),order.getCount(),order.getPrice()));
            amount = amount+order.getCount() * order.getPrice();
        }
        System.out.println("总计："+amount);
    }

}
