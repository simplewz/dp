package memento.base;

/**
 * Description: 备忘录类<br/>
 * 负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录
 * 备忘录有两个接口，Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象
 *                Originator能够看到一个宽接口，允许它访问返回到先前的状态所需的所有数据
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 9:55
 */
public class Memento {

    private String state;

    //有参构造方法，将相关需要备份的数据传入
    public Memento(String state) {
        this.state = state;
    }

    //只提供getter方法，不提供setter方法,防止修改，但能读取数据
    public String getState() {
        return state;
    }
}
