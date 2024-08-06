package composite.base;

/**
 * Component为组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为
 * 声明一个接口用于访问和管理Component的子部件
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/5 9:01
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);

}
