package mediator.base;

/**
 * Description:抽象同事类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 15:46
 */
public abstract class Colleague {

    protected Mediator mediator;

    //构造方法，得到中介者对象
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
