package strategy.cash.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 收银客户端V1：输入商品单价和数量，计算商品应收价格。无应对商场的促销活动策略
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/29 9:11
 */
public class CashV1 {

    public static void main(String[] args) {
        //总收费
        Double totalFee = 0.0;
        //格式化商品收费明细项字符串
        String cashItemFormat = "单价：%s,数量：%s,小计：%s";
        //商品收费明细
        List<String> cashContent = new ArrayList<>();
        System.out.println("请输入商品单价个数量,使用空格隔开：【30 1】,结束请输入#");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            //输入#结束收费项输入
            if(input.equals("#")){
                break;
            }else{
                //当前收费商品
                String currentCommodity = input;
                //用空格隔开输入得到以为数组，数组第一项为商品单价，第二项为商品数量
                String[] array = currentCommodity.split(" ");
                //商品单价
                Double price = Double.valueOf(array[0]);
                //商品数量
                Integer quantity = Integer.valueOf(array[1]);
                //当前商品总收金额
                Double currentFee = price * quantity;
                //累加当前商品总收金额，得到本次购物所有商品的总金额
                totalFee = totalFee + currentFee;
                //当前商品的收费明细
                String currentCashContent = String.format(cashItemFormat,price,quantity,currentFee);
                cashContent.add(currentCashContent);
            }
        }
        //输出本次收银明细
        for(String content:cashContent){
            System.out.println(content);
        }
        //输出本次收银应收总金额
        System.out.println("总计："+totalFee);
    }

}
