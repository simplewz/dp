package bridge.base;

/**
 * Description: 抽象<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 9:22
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public  void operation(){
        implementor.operation();
    }

}
