package responsechain.base;

/**
 * Description: 处理请示的接口<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/21 16:12
 */
public abstract class Handler {

    protected Handler successor;

    //设置继任者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理请求的抽象方法
    public abstract void handleRequest(int request);
}
