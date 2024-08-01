package memento.base;

/**
 * Description:管理者类 <br/>
 * 负责保存好备忘录，不能对备忘录的内容进行操作或检查
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 9:58
 */
public class Caretaker {

    private Memento memento;

    //获取备忘录
    public Memento getMemento() {
        return memento;
    }

    //设置备忘录
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
