package responsechain.base;

/**
 * Description: 具体处理者类1<br/>
 *  处理它负责的请求，可访问它的后继者，如果可以处理该请求，就处理，否则就将该请求转发给它的后继者
 *  处理0-10之间的请求
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/21 16:14
 */
public class ConcreteHandler1 extends Handler{

    @Override
    public void handleRequest(int request) {
        if(request>=0 && request<10){
            //处理0-10之间的请求
            System.out.println(String.format("%s处理请求%s",this.getClass().getName(),request));
        }else if(successor != null){
            //转移到下一位
            successor.handleRequest(request);
        }
    }
}
