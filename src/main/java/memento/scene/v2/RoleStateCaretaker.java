package memento.scene.v2;

/**
 * Description: 游戏角色状态管理类<br/>
 * 保存游戏状态的备忘录
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/1 10:35
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
