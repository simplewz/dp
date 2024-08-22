package mediator.base;

/**
 * Description: 抽象中介者类<br/>
 *  定义一个抽象的发送消息方法，得到同时对象和发送消息
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 15:45
 */
public abstract class Mediator {

    public abstract void send(String message,Colleague colleague);

}
