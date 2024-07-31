package state.base;

/**
 * Description: 抽象状态类<br/>
 *  定义一个接口以封装与Context的一个特定状态相关的行为
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 15:04
 */
public abstract class State {

    private String state;

    public State() {
    }

    public State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public abstract void handle(Context context);

    @Override
    public String toString() {
        return "State{" +
                "state='" + state + '\'' +
                '}';
    }
}
