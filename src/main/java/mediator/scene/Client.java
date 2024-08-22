package mediator.scene;

/**
 * Description: 客户端类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 16:29
 */
public class Client {

    public static void main(String[] args) {
        UnitedNationsSecurity security = new UnitedNationsSecurity();
        USA usa = new USA(security,"美国");
        Iraq iraq = new Iraq(security,"伊拉克");

        security.setUsa(usa);
        security.setIraq(iraq);

        usa.declare("伊拉克，不准研制核武器，否则将会发动战争！");
        iraq.declare("我们伊拉克没有核武器，也不怕侵略！");
    }

}
