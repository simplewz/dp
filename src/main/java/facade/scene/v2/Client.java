package facade.scene.v2;

/**
 * 购买基金客户端类
 * 用户购买了基金，不需要了解股票，与股票市场的交易行为交由基金公司完成
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/27 8:37
 */
public class Client {

    public static void main(String[] args) {
        Fund fund = new Fund();
        //基金购买
        fund.buyFund();
        //基金赎回
        fund.sellFund();
    }
}
