package flyweight.scene.v2;



/**
 * Description:客户端类 <br/>
 *
 * 使用享元模式实现了共享对象的目的，不管建几个网站，是要是展品展示都是一样的，只要是博客，也完全相同
 * 存在的问题：不能区分网站是那个客户的
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 10:21
 */
public class Client {

    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        //初次获取产品展示网站对象时，实例不存在，需要实例化
        WebSite wx = factory.getWebSiteCategory("产品展示");
        wx.use();
        //再次获取展品展示网站对象时，不再实例化
        WebSite wy = factory.getWebSiteCategory("产品展示");
        wy.use();
        WebSite wz = factory.getWebSiteCategory("产品展示");
        wz.use();

        WebSite wl = factory.getWebSiteCategory("博客");
        wl.use();
        WebSite wm = factory.getWebSiteCategory("博客");
        wm.use();
        WebSite wn = factory.getWebSiteCategory("博客");
        wn.use();

        System.out.println("网站分类总数为："+factory.getWebSiteCount());
    }

}
