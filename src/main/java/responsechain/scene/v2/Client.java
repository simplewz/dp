package responsechain.scene.v2;

/**
 * Description:客户端类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/21 16:57
 */
public class Client {

    public static void main(String[] args) {
        CommonManager jl = new CommonManager("经理");
        MajorManager zj = new MajorManager("总监");
        GeneraManager zjl = new GeneraManager("总经理");

        //设置处理链，可根据实际需求进行调整设置
        jl.setSuperior(zj);
        zj.setSuperior(zjl);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jl.processRequest(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jl.processRequest(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(500);
        jl.processRequest(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(1000);
        jl.processRequest(request4);

    }

}
