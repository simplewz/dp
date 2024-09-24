package flyweight.scene.v1;

/**
 * Description: 客户端类<br/>
 * 模拟给不同的客户开发上线功能相似的网站
 * 存在的问题：每个客户拥有一个网站实例，部署在各自独立的服务器上，当实例数量增多时，就需要相应的增加服务器数量，造成服务器资源的浪费
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 9:58
 */
public class Client {

    public static void main(String[] args) {
        WebSite wx = new WebSite("产品展示");
        wx.use();
        WebSite wy = new WebSite("产品展示");
        wy.use();
        WebSite wz = new WebSite("产品展示");
        wz.use();

        WebSite wl = new WebSite("博客");
        wl.use();
        WebSite wm = new WebSite("博客");
        wm.use();
        WebSite wn = new WebSite("博客");
        wn.use();
    }

}
