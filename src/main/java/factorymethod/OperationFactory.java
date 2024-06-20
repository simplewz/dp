package factorymethod;

/**
 * 运算工厂接口
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/20 8:24
 */
public interface OperationFactory {

    //返回Operation运算类
    public Operation createOperation();

}
