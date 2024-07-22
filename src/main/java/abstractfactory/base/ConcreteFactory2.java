package abstractfactory.base;

/**
 * Description: 具体工厂2<br/>
 *
 * 创建具有特定实现的产品对象
 * 使用工厂2的生产逻辑生产产品A和产品B
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 17:03
 */
public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2("ProductA2");
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2("ProductB2");
    }
}
