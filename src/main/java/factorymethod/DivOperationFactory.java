package factorymethod;

/**
 * 除法运算对象工厂类，专门负责除法运算对象的生产
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/20 8:32
 */
public class DivOperationFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
