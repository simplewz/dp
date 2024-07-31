package state.scene.v3;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 16:54
 */
public class RestState extends WorkState{

    public RestState() {
    }

    public RestState(String state) {
        super(state);
    }

    @Override
    public void coding(Work work) {
        System.out.println(String.format("当前时间：%s 点,%s", work.getHour(),getState()));
    }
}
