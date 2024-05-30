package strategy.cash.v2;

/**
 * 打折收费
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 10:22
 */
public class CashRebate implements Cash{
    //折扣
    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    //打折收费
    @Override
    public Double acceptMoney(Double money) {
        return money * rebate;
    }
}
