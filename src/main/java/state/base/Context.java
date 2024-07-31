package state.base;

/**
 * Description: <br/>
 * 维护一个ConcreteState子类的实例，这个实例定义当前的状态
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 15:06
 */
public class Context {

    private State state;

    //定义Context的初始状态
    public Context(State state) {
        this.state = state;
    }

    //State的属性为可读写状态
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态："+state.getState());
    }

    //对请求做处理，并设置下一状态
    public void processRequest(){
        state.handle(this);
    }

}
