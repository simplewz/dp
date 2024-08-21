package responsechain.scene.v1;

/**
 * Description: 管理者类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/20 14:20
 */
public class Manager {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void getResult(String managerLevel,Request request){
        if("经理".equals(managerLevel)){
            if("请假".equals(request.getRequestType())&&2 <= request.getNumber()){
                System.out.println(String.format("%s:%s数量%s被批准",name,request.getRequestContent(),request.getNumber()));
            }else{
                System.out.println(String.format("%s:%s数量%s我无权处理",name,request.getRequestContent(),request.getNumber()));
            }
        }else if("总监".equals(managerLevel)){
            if("请假".equals(request.getRequestType())&& 5 >= request.getNumber()){
                System.out.println(String.format("%s:%s数量%s被批准",name,request.getRequestContent(),request.getNumber()));
            }else{
                System.out.println(String.format("%s:%s数量%s我无权处理",name,request.getRequestContent(),request.getNumber()));
            }
        }else if("总经理".equals(managerLevel)){
            if("请假".equals(request.getRequestType())){
                System.out.println(String.format("%s:%s数量%s被批准",name,request.getRequestContent(),request.getNumber()));
            }else if("加薪".equals(request.getRequestType()) && 500 >= request.getNumber()){
                System.out.println(String.format("%s:%s数量%s被批准",name,request.getRequestContent(),request.getNumber()));
            }else if("加薪".equals(request.getRequestType()) && 500 < request.getNumber()){
                System.out.println(String.format("%s:%s数量%s再说吧",name,request.getRequestContent(),request.getNumber()));
            }
        }
    }

}
