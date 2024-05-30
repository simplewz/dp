package strategy.cash.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 收银客户端类V2，使用简单工厂模式，加入了应对商场促销活动收费策略
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 10:42
 */
public class CashV2 {

    public static void main(String[] args) {
        //总收费
        Double totalFee = 0.0;
        //格式化商品收费明细项字符串
        String cashItemFormat = "单价：%s,数量：%s,收费类型：%s,小计：%s";
        //商品收银明细
        List<String> cashContent = new ArrayList<>();
        //提示当前商场促销活动
        System.out.println("商场促销活动有：无折扣、满300减50、打8折");
        System.out.println("请输入商品单价、数量和收费类型,使用空格隔开(30 1 无折扣),结束请输入#");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            //输入#结束收费项输入
            if(input.equals("#")){
                break;
            }else{
                //当前收银商品
                String currentCommodity = input;
                //用空格隔开输入得到以为数组，数组第一项为商品单价，第二项为商品数量，第三项为促销活动策略
                String[] array = currentCommodity.split(" ");
                //当前商品单价
                Double price = Double.valueOf(array[0]);
                //当前商品数量
                Integer quantity = Integer.valueOf(array[1]);
                //当前商品收费策略
                String feeType = array[2];
                //根据不同的收费策略,使用简单工厂模式常见不同的收费算法
                Cash cash = CashFactory.createCash(feeType);
                //商品计算应收金额
                Double money = price * quantity;
                //根据商品的收费策略计算当前商品实收金额
                Double currentFee = cash.acceptMoney(money);
                //累加当前商品的收费，得到本次收银应收的总额
                totalFee = totalFee + currentFee;
                //当前商品收银明细
                String currentCashContent = String.format(cashItemFormat,price,quantity,feeType,currentFee);
                cashContent.add(currentCashContent);
            }
        }
        //输出收银明细
        for(String content:cashContent){
            System.out.println(content);
        }
        //输出本次收银总金额
        System.out.println("总计："+totalFee);
    }

}
