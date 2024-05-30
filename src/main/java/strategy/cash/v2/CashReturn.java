package strategy.cash.v2;

/**
 * 满减收费
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 10:24
 */
public class CashReturn implements Cash{

    //满减额度
    private Double conditionMoney;

    //满减金额
    private Double returnMoney;

    public CashReturn(Double conditionMoney, Double returnMoney) {
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public Double acceptMoney(Double money) {
        if(money>conditionMoney){
            double floor = Math.floor(money / conditionMoney);
            return money - returnMoney * floor;
        }else{
            return money;
        }
    }
}
