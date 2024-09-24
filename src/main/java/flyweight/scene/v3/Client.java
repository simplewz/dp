package flyweight.scene.v3;


/**
 * Description: 客户端类<br/>
 * 使用内部状态和外部状态区分了网站的不同用户
 *
 * 享元模式的应用：
 *  （1）如果一个程序使用了大量的对象，而大量的这些对象造成了很大的存储开销时就应该考虑使用享元模式
 *   (2)对象的大多数状态可以外部状态，如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象，此时可以考虑使用享元模式
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 10:42
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite wx = factory.getWebSiteCategory("产品展示");
        wx.use(new User("小王"));

        WebSite wy = factory.getWebSiteCategory("产品展示");
        wy.use(new User("大鸟"));

        WebSite wz = factory.getWebSiteCategory("产品展示");
        wz.use(new User("梅梅"));

        WebSite wl = factory.getWebSiteCategory("博客");
        wl.use(new User("用户1"));

        WebSite wm = factory.getWebSiteCategory("博客");
        wm.use(new User("用户2"));

        WebSite wn = factory.getWebSiteCategory("博客");
        wn.use(new User("用户3"));

        System.out.println("网站分类总数："+factory.getWebSiteCount());
    }

}
