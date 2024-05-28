package simplefactory;

/**
 * 运算符工厂类，根据运算符返回对应的运算对象
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/5/28 9:43
 */
public class OperationFactory {

    public static Operation createOperation(String oper){
        Operation operation = null;
        switch (oper){
            case "+":
            {
                operation = new OperationAdd();
                break;
            }
            case "-":
            {
                operation = new OperationSub();
                break;
            }
            case "*":
            {
                operation = new OperationMul();
                break;
            }
            case "/":{
                operation = new OperationDiv();
            }
            default:
            {
                System.out.println("输入运算符有误！");
            }

        }
        return operation;
    }

}
