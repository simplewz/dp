package responsechain.scene.v1;

/**
 * Description: 客户端类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/20 14:52
 */
public class Client {

    public static void main(String[] args) {
        Manager jl = new Manager("经理");
        Manager zj = new Manager("总监");
        Manager zjl = new Manager("总经理");

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(1000);

        jl.getResult("经理",request);
        zj.getResult("总监",request);
        zjl.getResult("总经理",request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(3);

        jl.getResult("经理",request2);
        zj.getResult("总监",request2);
        zjl.getResult("总经理",request2);

    }

}
