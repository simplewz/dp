package responsechain.scene.v2;

/**
 * Description: 总监类<br/>
 * 总监能处理员工5天以内的请假申请
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/21 16:42
 */
public class MajorManager extends Manager {

    public MajorManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        String requestType = request.getRequestType();
        String requestContent = request.getRequestContent();
        Integer number = request.getNumber();
        if("请假".equals(requestType)&&number<=5){
            System.out.println(String.format("%s:%s数量%s,被批准！",name,requestContent,number));
        }else{
            if(superior!=null){
                superior.processRequest(request);
            }
        }
    }
}
