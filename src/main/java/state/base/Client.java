package state.base;

/**
 * Description: 客户端类<br/>
 * 状态模式：当一个对象的内部状态改变时，允许改变其行为，这个对象看起来像是改变了其类
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类当中，如果这个状态判断很简单，就没必要用状态模式
 *
 * 状态模式的好处：将特定状态相关的行为局部化，并且将不同状态的行为分割开来
 * 将特定的状态相关的行为都放入一个对象中，由于所有与状态相关的代码都存在于某个具体的ConcreteState中，所以通过定义新的子类可以很容易地增加新的状态和转化
 * 这样做的目的是为了消除庞大的条件分支语句，状态模式通过把各种状态转移逻辑分布到State的子类之间，来减少相互间的依赖
 *
 * 什么时候考虑使用状态模式：
 * 当一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为是，就可以考虑使用状态模式
 * 另外，如果业务需求某项业务有多个状态，通常都是一些枚举常量，状态的变化都是依靠大量的多分支判断语句来实现，此时应该考虑将每一种业务状态定义为一个State的子类
 * 这样对象就介意不依赖其他对象而独立变化了，某一天客户需要更改需求，增加或减少业务状态或改变状态流程，也很同意修改
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 15:23
 */
public class Client {

    public static void main(String[] args) {
        //设置初始状态为ConcreteStateA
        State state = new ConcreteStateA("stateA");
        Context context = new Context(state);

        //不断处理请求，同事更改状态
        context.processRequest();
        context.processRequest();
        context.processRequest();
        context.processRequest();
    }

}
