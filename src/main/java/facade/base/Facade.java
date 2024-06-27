package facade.base;

/**
 * 外观模式：为子系统的一组接口提供一个一致的界面，此模式定义了一个高层次接口，这个接口使得子系统更加容易使用
 * 外观类：它需要了解所有子系统的方法或属性，进行组合，以备外界调用。
 *        知道哪些子系统负责处理请求，将客户的请求代理给适当的子系统对象
 *        子系统中没有任何外观类的信息
 * 何时使用外观模式：
 * 1.在设计初期阶段，应该有意识的将不同的两个层分离，比如经典的三层结构，就需要考虑在数据访问层、业务逻辑层和表示层的层与层之间建立外观Facade
 *   这样可以为复杂的子系统提供一个简单的接口，使得耦合大大降低
 * 2.在开发阶段，子系统往往因为不断地重构演化而变得越来越复杂，大多数的模式使时也都会产生很多很小的类，这本是好事，但也给外部调用它们的用户程序
 *   带来了使用上的困难，增加外观Facade可以提供一个简单的接口，减少它们之间的依赖。
 * 3.在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展了，但因为它包含非常重要的功能，新的需求开发必须依赖它。此时用外观模式Facade
 *   也是非常适合的。你可以为新系统开发一个外观Facade类，来提供设计粗糙或高度复杂的遗留代码的比较清晰简单的接口，让新系统与Facade对象交互，Facade
 *   与遗留代码交互所有复杂的工作。
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/27 8:45
 */
public class Facade {


    /**
     * 子系统类集合：实现子系统的功能，处理Facade对象指派的任务，子系统中没有任何Facade的任何信息
     */
    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    private SubSystemThree subSystemThree;

    private SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA(){
        subSystemThree.methodThree();
        subSystemTwo.methodTwo();
    }

    public void methodB(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemFour.methodFour();
    }

}
