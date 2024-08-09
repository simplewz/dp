package bridge.base;

/**
 * Description:客户端类 <br/>
 * 桥接模式：将抽象与它的实现部分分离，使它们都能独立地变化
 * 什么叫抽象与它的实现分离：
 *    抽象与它的实现分离并不是说让抽象类与其派生类分离
 *    实现指的是抽象类和它的派生类用来实现自己的对象
 *
 *  实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合
 *  例如：手机既可以按照品牌来进行分类，也可以按照软件功能来进行分类
 *
 * 对象的继承关系在编译时就定义好了，所以无法在运行时改变从父类继承的实现。
 * 子类的实现与父类有非常紧密的依赖关系，以至于父类实现中的任何变化必然会导致子类的变化。
 * 当需要重复使用子类时，如果继承下来的实现不适合解决新的问题，则父类必须重写或被其他更适合的类替换
 * 这种依赖关系限制了灵活性并最终限制了复用性，这时从可以考虑使用组合的关系来实现类对象的复用性
 *
 * 合成/聚合复用原则：尽量使用合成/聚合原则，尽量不要使用类的继承
 *
 * 聚合表示一种弱的拥有关系，体现的是A对象可以包含B对象，但B对象不是A对象的一部分
 * 合成则是一种强的拥有关系，体现了严格的部分和整体的关系，部分和整体的生命周期一致
 *
 * 合成/聚合复用原则的好处：优先使用对象的合成/聚合将有助于保持每个类被封装，并集中在单个任务上，这样类和类继承层次会保持较小规模
 * 并且不太可能增长为不可控制的庞然大物。
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 9:25
 */
public class Client {

    public static void main(String[] args) {
        Abstraction abstraction = new RefineAbstraction();
        Implementor implementor ;

        implementor = new ConcreteImplementorA();
        abstraction.setImplementor(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction.setImplementor(implementor);
        abstraction.operation();

    }

}
