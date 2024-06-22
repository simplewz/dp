package templatemethod.base;

/**
 * 公共抽象类，抽象出一个操作的实现逻辑架构，具体实现推迟到子类中去实现
 */
public abstract class AbstractClass {

    //抽象行为1，放到子类中去实现
    public abstract void primitiveOperation1();

    //抽象行为2，放到子类中去实现
    public abstract void  primitiveOperation2();

    //模板方法，给出了实现的骨架，而逻辑的组成是一些相应的抽象操作，它们都推迟到子类中去实现，子类的各自实现不相同
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }

}
