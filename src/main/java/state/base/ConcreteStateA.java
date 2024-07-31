package state.base;

/**
 * Description: 具体状态类A<br/>
 * 每一个子类实现一个与Context的一个特定状态相关的行为
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 15:08
 */
public class ConcreteStateA extends State{

    public ConcreteStateA() {
    }

    public ConcreteStateA(String state) {
        super(state);
    }

    @Override
    public void handle(Context context) {
        //设置ConcreteStateA的下一状态是ConcreteStateB
        context.setState(new ConcreteStateB("stateB"));
    }
}
