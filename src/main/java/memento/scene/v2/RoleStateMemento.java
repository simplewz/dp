package memento.scene.v2;

/**
 * Description: 游戏角色备忘录类<br/>
 * 保存游戏状态的属性数据，用于恢复游戏角色状态
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 10:33
 */
public class RoleStateMemento {

    //生命值
    private Integer vit;

    //攻击力
    private Integer atk;

    //防御力
    private Integer def;

    public RoleStateMemento(Integer vit, Integer atk, Integer def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public Integer getDef() {
        return def;
    }
}
