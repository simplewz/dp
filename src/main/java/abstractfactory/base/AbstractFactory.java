package abstractfactory.base;

/**
 * Description: <br/>
 * 抽象工厂接口:它里面应该包含所有产品创建的抽象方法
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:42
 */
public interface AbstractFactory {

    //生产产品A的方法
    public AbstractProductA createProductA();

    //生产产品B的方法
    public AbstractProductB createProductB();

}
