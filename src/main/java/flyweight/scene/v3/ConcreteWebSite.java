package flyweight.scene.v3;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 10:39
 */
public class ConcreteWebSite extends WebSite{

    //网站的内部数据
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    //在使用共享对象时，传入外部数据，以区分对象的使用者是谁
    @Override
    public void use(User user) {
        System.out.println(String.format("网站分类：%s,用户：%s",name,user.getName()));
    }
}
