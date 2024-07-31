package state.base;

/**
 * Description: 具体状态B<br/>
 * 每一个子类实现一个与Context的一个特定状态相关的行为
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 15:09
 */
public class ConcreteStateB extends State{


    public ConcreteStateB() {
    }

    public ConcreteStateB(String state) {
        super(state);
    }

    @Override
    public void handle(Context context) {
        //设置ConcreteStateB的下一状态是ConcreteStateA
        context.setState(new ConcreteStateA("stateA"));
    }
}
