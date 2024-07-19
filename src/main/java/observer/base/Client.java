package observer.base;

/**
 * Description: <br/>
 * 客户端
 * 观察者模式：定义了一种一对多的依赖关系，让多个观察者对象同时监听某个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己。
 * 观察者模式的动机：将一个系统分割成一系列相互协作的类有一个很不好的副作用，就是需要维护相关对象间的一致性，我们不希望为了维护一致性而使各类紧密耦合，这样会给维护、扩展和重用都带来不便。
 *               而观察者模式的关键对象是主题Subject和观察者Observer,一个主题可以有任意多个依赖它的观察者，一旦主题的状态发生了变更，所有的Observer都可以得到通知。Subject发出
 *               通知时并不需要知道谁是它的观察者，也就是说具体观察者是谁，它根本不需要知道。而任何一个具体观察者不知道耶不需要知道其他观察者的存在。
 * 什么时候使用观察者模式：
 *  1.当一个对象的改变需要同时改变其他对象的时候，而且它不知道具体有多少对象待改变时。
 *  2.一个抽象模型有两个方面，其中一个方面依赖于另一个方面，这时可以用观察者模式将两者封装在独立的对象中使它们各自独立地改变和复用。
 *
 * 总的来说，观察者模式所做的工作就是在解除耦合，让耦合的双方都依赖于抽象，而不是依赖于具体，从而使各自的变化都不会影响另一边的变化。
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:49
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("X",subject);
        ConcreteObserver observer2 = new ConcreteObserver("Y",subject);
        ConcreteObserver observer3 = new ConcreteObserver("Z",subject);

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.setSubjectState("ABC");
        subject.inform();
    }

}
