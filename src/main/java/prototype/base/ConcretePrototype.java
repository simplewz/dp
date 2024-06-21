package prototype.base;

/**
 * 具体原型类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 9:54
 */
public class ConcretePrototype extends Prototype{

    public ConcretePrototype(String id) {
        super(id);
    }

    /**
     * 调用Object类的clone()方法，创建当前对象的浅表副本，方法是创建一个新对象，然后将当前对象的非静态字段复制到该新对象。
     * 如果字段是值类型，则对该字段执行逐位复制
     * 如果字段是引用类型，则复制引用，但不复制引用的对象,因此，克隆对象和原始对象的引用类型变量指向同一对象地址，当引用的对象
     * 信息修改后，克隆对象和原始对象的引用对象的信息都会跟随发生改变
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Prototype Clone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
