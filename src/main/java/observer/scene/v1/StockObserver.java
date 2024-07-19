package observer.scene.v1;

/**
 * Description: <br/>
 * 观察股票的同事类：拥有前台秘书类的引用，可接受前台秘书的通知，更新自己的工作状态
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 14:43
 */
public class StockObserver {

    //观察股票的同事的姓名
    private String name;

    //前台类的引用，可接受前台的消息
    private Secretary secretary;

    public StockObserver(String name,Secretary secretary){
        this.name = name;
        this.secretary = secretary;
    }

    //得到前台通知，更新自己的工作状态
    public void update(){
        System.out.println(String.format("%s,%s 关闭股票行情网页，继续工作！",secretary.getBossState(),name));
    }

}
