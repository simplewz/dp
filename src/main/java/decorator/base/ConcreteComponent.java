package decorator.base;

/**
 * ConcreteComponent是定义了一个具体的独享，也可以给这个对象添加一些职责
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 9:59
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
