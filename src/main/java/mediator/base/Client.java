package mediator.base;

/**
 * Description: 客户端类<br/>
 * 中介者模式：用一个中介对象来封装一系列的对象交互。中介者使各对象之间不需要显式地相互引用，从而降低对象之间的耦合性，而且可以独立地改变它们之间的交互
 * 中介模式的优点：
 *   1.由于中介者Mediator的出现，减少了各个Colleague之间的耦合，使得可以独立地改变和复用各个Colleague和Mediator。
 *   2.由于把对象如何协作进行了抽象，将中介作为一个独立的概念并将其封装在一个对象中，这样关注的兑现就从各个对象各自本身的行为转移到它们之间的交互上来，也就站在一个更宏观的角度中去看待系统。
 *
 * 缺点：
 *   由于ConcreteMediator控制了集中化，与是把交互复杂性变为了中介者的复杂性，这就使得中介者变得会比任何一个ConcreteColleague都复杂。
 *
 * 中介者模式的应用场合：
 *    1.中介者模式一般应用于一组对象定义良好但是以复杂的方式进行通信的场合。
 *    2.想定制一个分布在多个类中的行为，而又不想生成太多的子类的场合。
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 15:59
 */
public class Client {

    public static void main(String[] args) {
        //让两个具体同事类认识中介者对象
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        //让中介者认识各个具体同事类对象
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        //具体同事类对象发送消息都是通过中介者进行转发
        colleague1.send("吃饭了吗？");
        colleague2.send("没有，要一起吗？");
    }

}
