package memento.base;

/**
 * Description: 客户端类<br/>
 *  备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复至原先保存的状态
 *  Originator(发起人类):负责创建一个备忘录Memento，用以记录当前时刻对象的内部状态，并可使用备忘录恢复内部状态,Originator可以根据需要决定Memento存储哪些Originator的状态数据
 *  Memento（备忘录类）:负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录
 *      备忘录有两个接口：
 *         Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象
 *         Originator能够看到一个宽接口，允许它访问返回到先前的状态所需的所有数据
 *  Caretaker：负责保存好备忘录，不能对备忘录的内容进行操作或检查
 *
 * 备忘录模式使用场景：Memento比较适用于功能比较复杂的，但需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分,Originator可以根据保存的Memento信息还原到前一状态
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 10:00
 */
public class Client {

    public static void main(String[] args) {
        //初始化Originator并将其state设置为ON
        Originator originator = new Originator();
        originator.setState("ON");
        originator.show();

        //保存状态，由于有了封装，可以隐藏Originator的实现细节
        Caretaker caretaker = new Caretaker();
        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);

        //Originator改变了状态属性
        originator.setState("OFF");
        originator.show();

        //从备忘录中恢复至改变状态之前
        originator.recovery(caretaker.getMemento());
        originator.show();
    }

}
