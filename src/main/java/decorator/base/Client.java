package decorator.base;

/**
 * 装饰模式：动态地给一个对象添加一些额外的职能
 * 当系统中需要新功能的时候，向旧的类中添加新的代码，这些新的代码通常装饰了原有类的核心职责或主要行为
 * 在主类中加入了新的字段、新的方法和新的逻辑，从而增加了主类的复杂性，而这些新加入的代码仅仅是为了满足一些
 * 只在某种特定情况下才会执行的特殊行为的需要。
 * 装饰模式为了解决这种问题提供了一个解决方案：它把每个要装饰的功能单独放在独立的类中，并让这个类包装它所要
 * 装饰的对象，因此，当需要执行特殊行为时，客户代码就可以在运行的时候根据需要有选择地、按顺序地使用装饰功能包装对象
 * 优点：把类的装饰功能从类中移除，简化原有的类，有效地把类的核心职责和装饰功能区分开。
 * 注意点：装饰的顺序
 * 客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 10:19
 */
public class Client {

    public static void main(String[] args) {
        /*
            装饰的方法是：首先调用ConcreteComponent实例化对象c,然后调用ConcreteDecoratorA的实例化对象d1来包装c
            再调用ConcreteDecoratorB的对象来包装d1，最终执行d2的operation方法。
            装饰模式是利用setComponent来对对象进行包装的，这样诶个装饰对象的实现就和如何使用这个对象分离开了，每个装饰
            对象只关心自己的功能，不需要关心如何被添加到对象链当中的。
            如果只有一个ConcreteComponent类而没有抽象的Component类，那么Decorator类可以是ConcreteComponent的一个子类
            如果只有一个ConcreteDecorator类，那么就没有必要建立一个单独的Decorator类，而可以把Decorator类和ConcreteDecorator类的责任合并成一个类
         */
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }

}
