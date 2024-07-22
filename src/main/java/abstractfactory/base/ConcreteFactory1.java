package abstractfactory.base;

/**
 * Description: 具体工厂类1<br/>
 *  创建具有特定实现的产品对象
 *  使用工厂1的生产逻辑生产产品A和产品B
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:56
 */
public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1("ProductA1");
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1("ProductB1");
    }
}
