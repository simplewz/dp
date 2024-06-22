package templatemethod.base;

/**
 * 具体类A,继承AbstractClass类，实现其中的抽象方法（其实现方式与其他的具体实现类ConcreteClassB不一样），完成templateMethod方法逻辑的具体实现
 */
public class ConcreteClassA extends AbstractClass{
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
