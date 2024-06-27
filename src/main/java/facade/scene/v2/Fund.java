package facade.scene.v2;

import facade.scene.v1.*;

/**
 * 基金类：购买了众多股票，用户购买了基金不需要了解基金的具体股票，又基金经理操根据市场情况操作基金股票的买入和卖出行为
 * 基金类需要了解所有的股票或其他投资产品的方法或属性，进行组合，以备外界调用
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/27 8:28
 */
public class Fund {

    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt1 debt1 ;
    private Realty1 realty1 ;


    public Fund() {
        this.stock1 = new Stock1("stock1");
        this.stock2 = new Stock2("stock2");
        this.stock3 = new Stock3("stock3");
        this.debt1 = new NationalDebt1("debt1");
        this.realty1 = new Realty1("realty1");
    }

    public void sellFund(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
        debt1.sell();
        realty1.sell();
    }

    public void buyFund(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
        debt1.buy();
        realty1.buy();
    }

}
