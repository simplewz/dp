package decorator.base;

/**
 * 装饰类，与具体的对象实现相同的接口，并同时拥有具体对象的引用
 * 使用setComponent来设置需要进行装饰的对象
 * 在实现接口中的方法时，核心是调用具体对象的职责方法，但可以在调用前后进行一些装饰
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 10:04
 */
public abstract class Decorator extends Component{

    private Component component;

    //设置需要装饰的Component对象
    public void setComponent(Component component) {
        this.component = component;
    }

    //重写operation方法，实际执行的是component的operation方法
    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
