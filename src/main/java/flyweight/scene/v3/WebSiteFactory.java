package flyweight.scene.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:网站工厂类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 10:41
 */
public class WebSiteFactory {

    private Map<String, WebSite> flyweights = new HashMap<>();

    /**
     * 返回客户端需要的网站实例对象
     * 先判断是否存在这个对象，如果存在，则直接返回，如果不存在，则实例化它再返回
     * @param key
     * @return
     */
    public WebSite getWebSiteCategory(String key){
        if(!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    /**
     * 获取网站实例个数
     * @return
     */
    public int getWebSiteCount(){
        return flyweights.size();
    }

}
