package command.scene.v1;

/**
 * Description: 客户端类<br/>
 * 客户单程序与烤肉者紧耦合。程序虽然简单，但存在许多问题
 * 如：
 *  1.烤串的人多了，需要精准记忆每一位顾客的烤串需求，容易出错
 *  2.烤串的人可能变更烤串需求
 *  3.结账时顾客和烤串的人之间没有凭据，容易出错
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:05
 */
public class Client {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeChickenWing();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeChickenWing();
    }

}
