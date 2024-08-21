package responsechain.scene.v2;

/**
 * Description: 管理者类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/21 16:38
 */
public abstract class Manager {

    protected String name;

    //上级管理
    protected Manager superior;


    public Manager(String name) {
        this.name = name;
    }

    //设置上级管理
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void processRequest(Request request);

}
