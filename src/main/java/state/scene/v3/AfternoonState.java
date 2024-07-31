package state.scene.v3;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 16:53
 */
public class AfternoonState extends WorkState{

    public AfternoonState() {
    }

    public AfternoonState(String state) {
        super(state);
    }

    @Override
    public void coding(Work work) {
        if(work.getHour()<17) {
            System.out.println(String.format("当前时间：%s 点,%s", work.getHour(),getState()));
        }else{
            if(work.isFinish()){
                work.setWorkState(new RestState("下班休息！"));
                work.coding();
            }else{
                work.setWorkState(new EveningState("晚上加班！"));
                work.coding();
            }
        }
    }
}
