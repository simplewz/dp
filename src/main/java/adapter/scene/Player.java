package adapter.scene;

/**
 * Description: 篮球运动员类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/31 14:52
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    //进攻
    public abstract void attack();

    //防守
    public abstract void defense();
}
