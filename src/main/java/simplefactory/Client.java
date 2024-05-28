package simplefactory;

import java.util.Scanner;

/**
 * 客户端测试程序
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/28 9:50
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("请输入运算的第一位数：");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        System.out.println("请输入运算的第二位数：");
        double number2 = scanner.nextDouble();
        System.out.println("请输入运算符(+-*/)：");
        String oper = scanner.next();
        Operation operation = OperationFactory.createOperation(oper);
        Double result = operation.getResult(number1, number2);
        System.out.println(String.format("%s %s %s = %s", number1, oper, number2, result));
    }
}
