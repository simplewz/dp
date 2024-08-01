package memento.scene.v2;

/**
 * Description:客户端类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 10:38
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

        //保存游戏进度：由于封装在Memento中，因此我们不知道保存了哪些游戏角色的数据
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        RoleStateMemento memento = lixiaoyao.saveState();
        stateAdmin.setRoleStateMemento(memento);


        //战斗
        lixiaoyao.fight();
        //战斗后游戏角色属性展示
        System.out.println("======游戏角色战斗后属性展示：=====");
        lixiaoyao.display();

        //从备忘录中恢复至战斗前的游戏数据
        lixiaoyao.recovery(stateAdmin.getRoleStateMemento());

        //恢复后角色属性展示
        System.out.println("======游戏角色战斗后恢复至战斗前属性展示：=====");
        lixiaoyao.display();
    }

}
