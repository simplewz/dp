package command.scene.v2;

/**
 * Description: 烤串抽象命令类<br/>
 *
 * 烤串的人只需要接受需要烤什么的顾客需求，并执进行烤串即可
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:09
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    //确定烤串的人是谁
    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    //执行烤串
    public abstract void executeCommand();

}
