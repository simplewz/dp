package prototype.base;

/**
 * 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *         原型模式其实就是从一个对象再创建另外一个可定制对象，而且不需要知道任何创建细节
 * 克隆模式的使用优点：一般在初始化的信息不发生变化的情况下，克隆对象节省了执行类的构造函数的性能开销，隐藏了对象创建的细节。
 * 注意点：Java默认使用的克隆方式是浅克隆方式，即类的成员变量如果是基本类型，则将其值复制到克隆对象对应的属性中，而对引用类型
 *        属性，复制的是引用变量的地址，克隆对象与原始对象的引用变量指向内存中的同一对象地址。这种方式的弊端是当修改原始对象
 *        引用类型指向的对象时，克隆对象引用变量指向的对象也会被修改。即克隆对象与原始对象的引用类型的变量指向的对象不是独立的。
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 10:02
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype p1 = new ConcretePrototype("I");
        Prototype c1 = p1.Clone();
        System.out.println(p1);
        System.out.println(c1);
        System.out.println(p1.getId());
        System.out.println(c1.getId());
    }

}
