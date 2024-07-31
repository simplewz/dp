package state.scene.v3;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 16:43
 */
public class Work {

    private int hour;

    private boolean finish;

    private WorkState workState;

    public Work() {
    }

    public Work(WorkState workState) {
        this.workState = workState;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public WorkState getWorkState() {
        return workState;
    }

    public void setWorkState(WorkState workState) {
        this.workState = workState;
    }

    public void coding(){
        workState.coding(this);
    }
}
