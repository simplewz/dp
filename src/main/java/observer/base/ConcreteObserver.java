package observer.base;

/**
 * Description: <br/>
 * 具体观察者：实现抽象观察者角色所要求的更新接口，以便时本身的状态与主题的状态保持相协调
 *         具体观察者角色可以保存一个指向具体主题对象的引用。
 *         具体观察者角色通常用一个具体子类来实现。
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:44
 */
public class ConcreteObserver extends Observer{

    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者"+name+"的最新状态是："+observerState);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObserverState() {
        return observerState;
    }

    /*
    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }*/

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
