package command.base;

/**
 * Description: 客户端类<br/>
 * 命令模式：将一个请求封装为一个对象，从而使你可以用不同的请求对客户端进行参数化；对请求排队或记录请求日志，以及支持可撤销操作
 *
 * 命令模式的优点：
 *  1.它能较容易地设计一个命令队列
 *  2.在需要的情况下，可以较容易地将命令记入日志
 *  3.允许接搜请求的一方决定是否要否决请求
 *  4.可以很容易实现对请求的撤销和重做
 *  5.由于加新的具体命令类不影响其他的类，因此增加新的具体命令类很容易
 *
 * 敏捷开发的原则告诉我们，不要为代码添加基于猜测的、实际不需要的功能。
 * 如果不清楚一个系统是否需要命令模式，一般就不要着急去实现它，事实上，在需要的时候通过重构实现命令模式并不难，
 * 只有在真正需要撤销/恢复操作等功能时，把原来的代码重构为命令模式才有意义
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 16:48
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }

}
