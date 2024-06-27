package facade.scene.v1;

/**
 * 客户炒股客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/27 8:20
 */
public class Client {

    public static void main(String[] args) {
        Stock1 stock1 = new Stock1("stock1");
        Stock2 stock2 = new Stock2("stock2");
        Stock3 stock3 = new Stock3("stock3");
        NationalDebt1 debt1 = new NationalDebt1("debt1");
        Realty1 realty1 = new Realty1("realty1");

        //客户需要了解股票、国债、房地产的情况，操作这些产品买入与卖出行为，耦合性很高
        stock1.buy();
        stock2.buy();
        stock3.buy();
        debt1.buy();
        realty1.buy();

        stock1.sell();
        stock2.sell();
        stock3.sell();
        debt1.sell();
        realty1.sell();

    }

}
