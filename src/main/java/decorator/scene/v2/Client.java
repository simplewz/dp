package decorator.scene.v2;

/**
 * 客户端类
 * 模拟换装功能，这种模式下实现了Person类与装饰类的代码分离
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 9:38
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("simple");
        System.out.println("第一种装扮：");
        Finery tShirts = new TShirts();
        Finery bigTrouser = new BigTrouser();
        Finery sneakers = new Sneakers();
        tShirts.show();
        bigTrouser.show();
        sneakers.show();
        person.show();

        System.out.println("第二种装扮：");
        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery leatherShoes = new LeatherShoes();
        suit.show();
        tie.show();
        leatherShoes.show();
        person.show();
    }
}
