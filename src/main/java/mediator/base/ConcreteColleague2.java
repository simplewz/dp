package mediator.base;

/**
 * Description:具体同事对象2 <br/>
 * 每个具体同事只知道自己的行为，而不了解其他同事类的情况，但它们却都认识中介者对象
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 15:48
 */
public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //发送消息时通常是中介者发送出去的
    public void send(String message){
        mediator.send(message,this);
    }

    //接收消息
    public void receive(String message){
        System.out.println("同事2得到信息："+message);
    }

}
