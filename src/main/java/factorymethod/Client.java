package factorymethod;

/**
 * 简单工厂模式的优点：工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖
 * 简单工厂模式的缺点：新增加功能时，需要去工厂类中添加新的条件分支，违反了类的开放-封闭原则
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到子类
 * 工厂方法模式实现计算器功能时，客户端要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑
 * 判断移到了客户端代码来进行，想要增加功能，本来时修改工厂类的代码，而现在时修改客户端代码
 *
 * 工厂方法模式的优点：工厂方法模式克服了简单工厂模式违背开放-封闭原则的缺点，保持了封装对象创建过程的有待呢
 * 两种设计模式都集中了封装对象的创建，使得要更换对象时，不需要做大的改动就可以实现，降低了客户程序与产品对象的耦合。
 * 工厂方法模式是简单工厂模式的进一步抽象和推广，由于使用了多态性，工厂方法模式保持了简单工厂模式的优点，克服了它的缺点
 * 但缺点是由于每加一个产品，就需要加一个产品工厂类，增加了额外的开发量
 * 客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/20 8:34
 */
public class Client {

    public static void main(String[] args) {
        OperationFactory operationFactory  = null;
        operationFactory  = new AddOperationFactory();

        //需要更改运算方法时，仅需修改运算的具体实现对象
        //operationFactory = new MulOperationFactory();
        Operation addOperation = operationFactory.createOperation();
        Double number1 = 1.0;
        Double number2 = 9.0;
        Double result = addOperation.getResult(number1, number2);
        System.out.println(String.format("%s + %s = %s",number1,number2,result));
    }

}
