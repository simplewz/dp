package decorator.base;

/**
 * 具体装饰类A
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 10:11
 */
public class ConcreteDecoratorA extends Decorator{

    //本类独有的功能，用于区别其他装饰类
    private String addedState;

    @Override
    public void operation(){
        //首先运行原Component的operation方法，再执行本类的功能，如addState,相当于对原Component进行了装饰
        super.operation();
        addedState = "new State";
        System.out.println("具体装饰对象A的操作");
    }

}
