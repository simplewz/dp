package bridge.scene.v4;

/**
 * Description:手机品牌类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/8 17:26
 */
public abstract class HandsetBrand {

    protected HandsetSoft soft;

    //设置手机软件，品牌需要关注软件、所以在机器中安装软件，已被运行
    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    //运行软件
    public abstract void run();
}
