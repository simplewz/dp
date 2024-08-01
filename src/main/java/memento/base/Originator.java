package memento.base;

/**
 * Description: 发起人类<br/>
 * 负责创建一个备忘录Memento，用以记录当前时刻对象的内部状态，并可使用备忘录恢复内部状态
 * Originator可以根据需要决定Memento存储哪些Originator的状态数据
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 9:54
 */
public class Originator {

    private String state;

    //创建备忘录
    public Memento createMemento(){
        return new Memento(state);
    }

    //从备忘录恢复
    public void recovery(Memento memento){
        this.state = memento.getState();
    }

    //属性展示
    public void show(){
        System.out.println("state="+state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
