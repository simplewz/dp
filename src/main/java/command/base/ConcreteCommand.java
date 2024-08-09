package command.base;

/**
 * Description: ConcreteCommand类<br/>
 * 将一个接收者对象绑定与某个动作，调用接收者相应的操作，以实现execute
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 16:44
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
