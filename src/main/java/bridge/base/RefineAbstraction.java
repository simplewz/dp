package bridge.base;

/**
 * Description:被提炼的抽象 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 9:24
 */
public class RefineAbstraction extends Abstraction{

    @Override
    public void operation() {
        implementor.operation();
    }
}
