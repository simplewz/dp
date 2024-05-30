package strategy.base;

/**
 * 客户端实现类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 11:15
 */
public class Client {

    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyA());
        context.ContextInterface();
        context = new Context(new StrategyB());
        context.ContextInterface();
        context = new Context(new StrategyC());
        context.ContextInterface();
    }

}
