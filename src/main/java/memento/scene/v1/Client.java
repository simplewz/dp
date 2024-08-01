package memento.scene.v1;

/**
 * Description: 客户端类<br/>
 * 需求描述：一个游戏角色有生命值、攻击力和防御力属性，在打Boss之前和之后其属性不一样，允许玩家感觉与Boss决斗后恢复至战斗前
 * 缺点：客户端职责过重
 *      保存游戏进度时的实现细节完全暴露给客户端，新增备份属性时需要修改保存游戏进度的实现逻辑
 *      读取游戏档案恢复时同样存在上述问题
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 9:36
 */
public class Client {

    public static void main(String[] args) {
        //新建游戏角色
        GameRole lixiaoyao = new GameRole();
        //游戏角色属性初始化
        lixiaoyao.init();
        //游戏角色属性展示
        System.out.println("======游戏角色初始化后属性展示：=====");
        lixiaoyao.display();

        //保存游戏进度：新建一个备份角色，保存游戏角色战斗前的属性，以便战斗后从这里恢复
        GameRole backup = new GameRole();
        backup.setVit(lixiaoyao.getVit());
        backup.setAtk(lixiaoyao.getAtk());
        backup.setDef(lixiaoyao.getDef());

        //战斗
        lixiaoyao.fight();
        //战斗后游戏角色属性展示
        System.out.println("======游戏角色战斗后属性展示：=====");
        lixiaoyao.display();

        //恢复游戏角色战斗前的状态
        lixiaoyao.setVit(backup.getVit());
        lixiaoyao.setAtk(backup.getAtk());
        lixiaoyao.setDef(backup.getDef());

        //恢复后角色属性展示
        System.out.println("======游戏角色战斗后恢复至战斗前属性展示：=====");
        lixiaoyao.display();

    }

}
