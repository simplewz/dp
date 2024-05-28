package simplefactory;

/**
 *  除法运算，返回两个数之商
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/28 9:38
 */
public class OperationDiv implements Operation{

    @Override
    public Double getResult(Double number1, Double number2) {
        return number1 / number2;
    }
}
