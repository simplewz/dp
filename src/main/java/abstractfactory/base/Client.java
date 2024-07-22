package abstractfactory.base;

/**
 * Description:客户端类 <br/>
 * 抽象工厂模式：提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们的具体实现
 * 抽象工厂模式的优点：
 *  1.便于交换产品系列，由于具体工厂类在一个应用中只需要在初始化的时候出现一次，这就使得改变一个应用的具体工厂变得很容易，只需改变具体工厂即可使用不同的产品配置。
 *  2.它让具体的创建实例过程与客户端分离，客户端是通过他它们的抽象接口操纵实例，产品的具体类名也被具体工厂的实现分离，不会出现在客户端代码中。
 *
 * 抽象工厂模式的缺点：
 * 当需要新增产品时，代码改动量会很大，需要增加AbstractProductX、ProductX1、ProductX2,还需要更改AbstractFactory、ConcreteFactory1、ConcreteFactory2类代码
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 17:06
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA1 = factory.createProductA();
        AbstractProductB productB1 = factory.createProductB();

        System.out.println(productA1.getName());
        System.out.println(productB1.getName());

        factory = new ConcreteFactory2();
        AbstractProductA productA2 = factory.createProductA();
        AbstractProductB productB2 = factory.createProductB();
        System.out.println(productA2.getName());
        System.out.println(productB2.getName());
    }
    
}
