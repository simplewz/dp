package responsechain.scene.v2;

/**
 * Description: 总经理类<br/>
 * 总经理能处理超过5天的请假和申请加薪500以内的请求
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/21 16:42
 */
public class GeneraManager extends Manager {

    public GeneraManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        String requestType = request.getRequestType();
        String requestContent = request.getRequestContent();
        Integer number = request.getNumber();
        if("请假".equals(requestType)){
            System.out.println(String.format("%s:%s数量%s,被批准！",name,requestContent,number));
        }else if("加薪".equals(requestType)){
            if(number<=500){
                System.out.println(String.format("%s:%s数量%s,被批准！",name,requestContent,number));
            }else{
                System.out.println(String.format("%s:%s数量%s,再说吧！",name,requestContent,number));
            }
        }
    }
}
