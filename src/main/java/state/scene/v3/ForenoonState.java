package state.scene.v3;

/**
 * Description: <br/>
 * 上午工作状态
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 16:49
 */
public class ForenoonState extends WorkState{

    public ForenoonState() {
    }

    public ForenoonState(String state) {
        super(state);
    }

    @Override
    public void coding(Work work) {
        if(work.getHour()<12){
            System.out.println(String.format("当前时间：%s 点,%s", work.getHour(),getState()));
        }else {
            work.setWorkState(new NoonState("饿了，没什么精神"));
            work.coding();
        }
    }
}
