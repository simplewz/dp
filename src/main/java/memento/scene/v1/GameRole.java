package memento.scene.v1;

/**
 * Description:游戏角色类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 9:30
 */
public class GameRole {

    //生命值
    private Integer vit;

    //攻击力
    private Integer atk;

    //防御力
    private Integer def;

    //初始化
    public void init(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //游戏角色属性展示
    public void display(){
        System.out.println("角色当前状态：");
        System.out.println(String.format("生命值：%s",vit));
        System.out.println(String.format("攻击力：%s",atk));
        System.out.println(String.format("防御力：%s",def));
    }

    //战斗后属性变化
    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}
