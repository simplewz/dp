package adapter.scene;

/**
 * Description: 前锋<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/31 14:54
 */
public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("前锋：%s进攻",name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("前锋：%s防守",name));
    }
}
