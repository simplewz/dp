package factorymethod;

/**
 * 减法运算，返回两个数之差
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/28 9:36
 */
public class OperationSub implements Operation {

    @Override
    public Double getResult(Double number1, Double number2) {
        return number1 - number2;
    }
}
