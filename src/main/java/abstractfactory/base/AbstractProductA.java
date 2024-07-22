package abstractfactory.base;

/**
 * Description: 抽象产品A <br/>
 * 抽象产品A可能有两种不同的实现
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:44
 */
public abstract class AbstractProductA {

    private String name;

    public AbstractProductA() {
    }

    public AbstractProductA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
