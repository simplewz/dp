package state.scene.v3;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 16:53
 */
public class EveningState extends WorkState{

    public EveningState() {
    }

    public EveningState(String state) {
        super(state);
    }

    @Override
    public void coding(Work work) {
        if(work.getHour()<21) {
            System.out.println(String.format("当前时间：%s 点,%s", work.getHour(),getState()));
        }else{
            work.setWorkState(new SleepingState("干不动了，该睡了！"));
            work.coding();
        }
    }
}
