package decorator.base;

/**
 * 具体装饰类B
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 10:11
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation(){
        //首先运行原Component的operation方法，再执行本类的功能，如addedBehavior(),相当于对原Component进行了装饰
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    public void addedBehavior(){
        System.out.println("增加的行为方法");
    }

}
