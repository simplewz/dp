package decorator.scene.v3;

/**
 * 皮鞋装饰类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 10:46
 */
public class LeatherShoes extends Finery{

    @Override
    public void show(){
        System.out.println("皮鞋");
        super.show();
    }

}
