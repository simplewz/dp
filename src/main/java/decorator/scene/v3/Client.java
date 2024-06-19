package decorator.scene.v3;

/**
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 10:53
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("simple");
        System.out.println("第一种装扮：");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        //装饰过程
        sneakers.decorate(person);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();

        System.out.println("第二种装扮：");
        LeatherShoes leatherShoes = new LeatherShoes();
        Suit suit = new Suit();
        Tie tie = new Tie();
        //装饰过程
        leatherShoes.decorate(person);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();
    }

}
