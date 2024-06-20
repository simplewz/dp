package factorymethod;

/**
 * 加法运算工厂类,专门负责加法运算类对象的生产
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/20 8:26
 */
public class AddOperationFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
