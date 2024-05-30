package strategy.cash.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 使用策略模式与简单工厂模式相结合创建不同的收银应用上下文，实现收银策略与客户端代码的解耦，
 * 客户端仅需告知使用什么样的收银策略，具体的收银策略在创建收银应用上下文中完成
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 17:24
 */
public class CashV4 {

    public static void main(String[] args) {
        //当前收银应用上下文
        CashContextV2 context = null;
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
            if(input.equals("#")){
                //输入#结束收银项输入
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
                //根据不同的收银策略创建不同的收银上下文
                context = new CashContextV2(feeType);
                //商品应收金额
                Double money = price * quantity;
                //根据不同的收银环境计算当前收银金额
                Double currentFee = context.getResult(money);
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
