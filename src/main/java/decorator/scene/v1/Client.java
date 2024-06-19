package decorator.scene.v1;

/**
 * 客户端类
 *  装扮模式场景模拟客户端v1版本：模拟给人换装的Avatar系统，类似与QQ的装扮功能
 *  这种方式虽然实现了人物换装的功能，但是当需要添加别的装盘时，需要修改Person类的代码
 *  装扮的代码与Person类的基础代码严重耦合，违反了类的开放封闭原则
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 9:07
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("simple");
        System.out.println("第一种装扮：");
        person.wearTShirt();
        person.wearBigTrouser();
        person.wearSneakers();
        person.show();

        System.out.println("第二种装扮：");
        person.wearSuit();
        person.wearTie();
        person.wearLeatherShoes();
        person.show();
    }

}
