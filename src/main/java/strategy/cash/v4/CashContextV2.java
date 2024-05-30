package strategy.cash.v4;

import strategy.cash.v2.Cash;
import strategy.cash.v2.CashNormal;
import strategy.cash.v2.CashRebate;
import strategy.cash.v2.CashReturn;

/**
 * 策略模式与简单工厂模式的结合
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 17:20
 */
public class CashContextV2 {

    //收费接口
    private Cash cash;

    //通过不同的策略返回不同的收费上下文
    public CashContextV2(String feeType) {
        switch (feeType){
            case "无折扣":
            {
                cash = new CashNormal();
                break;
            }
            case "满300减50":
            {
                cash =new CashReturn(300.0,50.0);
                break;
            }
            case "打8折":
            {
                cash = new CashRebate(0.8);
            }
        }
    }

    public Double getResult(Double money){
        Double result = cash.acceptMoney(money);
        return result;
    }

}
