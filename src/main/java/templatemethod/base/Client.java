package templatemethod.base;

/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass;

        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();

    }
}
