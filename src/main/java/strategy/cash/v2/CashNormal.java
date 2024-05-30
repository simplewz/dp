package strategy.cash.v2;

/**
 * 正常收费
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 10:21
 */
public class CashNormal implements Cash{

    @Override
    public Double acceptMoney(Double money) {
        return money;
    }
}
