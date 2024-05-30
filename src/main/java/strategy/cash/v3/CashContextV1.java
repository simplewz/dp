package strategy.cash.v3;

import strategy.cash.v2.Cash;

/**
 * 收费上下文
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 16:57
 */
public class CashContextV1 {

    //收费接口
    private Cash cash;

    //通过构造函数传入收费策略
    public CashContextV1(Cash cash) {
        this.cash = cash;
    }

    public Double getResult(Double money){
        Double result = cash.acceptMoney(money);
        return result;
    }

}
