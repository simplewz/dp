package abstractfactory.base;

/**
 * Description: 抽象产品B<br/>
 *  抽象产品B可能有两种不同的实现
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:52
 */
public abstract class AbstractProductB {

    private String name;

    public AbstractProductB() {
    }

    public AbstractProductB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
