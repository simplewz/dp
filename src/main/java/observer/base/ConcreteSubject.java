package observer.base;

/**
 * Description: <br/>
 * 具体主题（具体通知类）：将有关状态存入具体观察者对象，在具体主题的内部状态改变时，给所有登记过的观察者发出通知
 * 具体主题角色通常用一个具体子类来实现
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:40
 */
public class ConcreteSubject extends Subject{

    //具体被观察者状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
