package responsechain.base;

/**
 * Description: 客户端类<br/>
 * 职责链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理请求为止
 * 职责链的优点：
 *   1.解除请求发送者与接收者之间的耦合关系。
 *    客户端提交的请求，沿请求链传递，直到有可以处理请求的处理器处理了该请求为止。
 *    接收者和发送者都没有对方的明确信息，且链条中的对象自己也不知道链条的结构。结果是职责链可以简化对象的相互连接，它们仅需保持一个指向其后继者的引用，而不需要保持它所有的候选接收者的引用
 *   2.可灵活调整请求的处理逻辑
 *     请求链由客户端来定义，请求链中处理请求的节点可由客户端端随时增加或修改
 *
 * 职责链模式的注意点：一个请求有可能在请求链的的末端都没有得到处理
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/21 16:22
 */
public class Client {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = new int[]{2,5,14,22,18,3,27,20};
        for (int request:requests) {
            h1.handleRequest(request);
        }
    }

}
