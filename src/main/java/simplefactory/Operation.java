package simplefactory;

/**
 * 运算接口类：返回两个数的运算结果，具体运算根据运算符的不同有不同的实现
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/28 9:22
 */
public interface Operation {

    public Double getResult(Double number1, Double number2);

}
