package flyweight.scene.v1;

/**
 * Description:网站类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 9:56
 */
public class WebSite {

    private String name;

    public WebSite(String name) {
        this.name = name;
    }

    public void use(){
        System.out.println("网站分类："+name);
    }
}
