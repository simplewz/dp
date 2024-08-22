package mediator.base;

/**
 * Description: 具体中介者<br/>
 * 实现抽象中介者类的方法，它需要知道所有具体的同事类，并从具体同事接收消息，向具体同事对象发消息
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 15:53
 */
public class ConcreteMediator extends Mediator{

    private ConcreteColleague1 colleague1;

    private ConcreteColleague2 colleague2;

    //中介者，需要了解所有的同事对象
    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    //重写发送消息方法，根据对象作出判断选择，通知对象
    @Override
    public void send(String message, Colleague colleague) {
        if(colleague==colleague1){
            colleague2.receive(message);
        }else{
            colleague1.receive(message);
        }
    }
}
