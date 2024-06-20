package factorymethod;

/**
 * 减法运算对象工厂类，专门负责生产减法运算对象
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/20 8:29
 */
public class SubOperationFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
