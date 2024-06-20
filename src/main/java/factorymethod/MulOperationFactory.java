package factorymethod;

/**
 * 乘法运算对象工厂类，专门负责乘法运算对象的生成
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/20 8:31
 */
public class MulOperationFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
