package strategy.base;

/**
 * 应用上下文
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 11:13
 */
public class Context {

    private Strategy strategy;

    //初始化时传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //根据具体的策略对象，调用其算法的方法
    public void ContextInterface(){
        strategy.algorithm();
    }

}
