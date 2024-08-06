package composite.scene;

/**
 * 公司抽象类
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/6 10:59
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    //用于管理子公司的方法
    public abstract void add(Company company);

    public abstract void remove(Company company);

    //展示
    public abstract void display(int depth);

    //履行职责
    public abstract void duty();
}
