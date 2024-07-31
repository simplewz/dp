package state.scene.v3;

/**
 * Description: 中午工作状态<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 16:52
 */
public class NoonState extends WorkState{

    public NoonState() {
    }

    public NoonState(String state) {
        super(state);
    }

    @Override
    public void coding(Work work) {
        if(work.getHour()<12){
            System.out.println(String.format("当前时间：%s 点,%s", work.getHour(),getState()));
        }else{
            work.setWorkState(new NoonRestState("午休"));
            work.coding();
        }
    }
}
