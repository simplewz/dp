package state.scene.v3;

/**
 * Description: <br/>
 * 工作状态类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 16:43
 */
public abstract class WorkState {

    private String state;

    public WorkState() {
    }

    public WorkState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "WorkState{" +
                "state='" + state + '\'' +
                '}';
    }

    public abstract void coding(Work work);

}
