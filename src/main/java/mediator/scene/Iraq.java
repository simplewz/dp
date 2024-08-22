package mediator.scene;

/**
 * Description: 伊拉克<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 16:24
 */
public class Iraq extends Country{

    public Iraq(UnitedNations unitedNations,String name) {
        super(unitedNations,name);
    }

    //声明
    public void declare(String message){
        unitedNations.declare(message,this);
    }

    //获得消息
    public void getMessage(String message){
        System.out.println(name+"获得对方消息："+message);
    }

}
