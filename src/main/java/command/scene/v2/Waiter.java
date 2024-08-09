package command.scene.v2;

/**
 * Description: 服务员类<br/>
 *
 * 用于解除顾客与烤串的人之间的紧耦合，顾客需要烤串时，先给服务员说，服务员记录烤串需求，再通知烤串的人按照菜单进行烤串
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:22
 */
public class Waiter {

    private Command command;

    //记录顾客的烤串需求
    public void setOrder(Command command){
        this.command = command;
    }

    //通知烤串师傅烤串
    public void notifyBake(){
        command.executeCommand();
    }

}
