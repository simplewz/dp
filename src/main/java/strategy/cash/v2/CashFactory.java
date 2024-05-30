package strategy.cash.v2;

/**
 * 收费对象工厂类
 * 弊端：收费类型固定为 无折扣、满300减50、打8折 三种，当商场的促销活动发生变化时，需要在收费对象工厂做代码变更，不够灵活
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 10:32
 */
public class CashFactory {

    public static Cash createCash(String feeType){
        Cash cash = null;
        switch (feeType){
            case "无折扣":
            {
                CashNormal cashNormal = new CashNormal();
                cash = cashNormal;
                break;
            }
            case "满300减50":
            {
                CashReturn cashReturn = new CashReturn(300.0, 50.0);
                cash = cashReturn;
                break;
            }
            case "打8折":
            {
                CashRebate cashRebate = new CashRebate(0.8);
                cash = cashRebate;
            }
            default:
            {
                System.out.println("无此收费类型！");
            }
        }
        return cash;
    }

}
