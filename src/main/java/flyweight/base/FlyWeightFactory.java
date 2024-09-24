package flyweight.base;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 享元工厂类，用来创建并挂你FlyWeight对象<br/>
 *  主要用来确保合理地共享FlyWeight，当用户请求一个FlyWeight时，FlyWeightFactory对象提供一个已经创建的实例或者创建一个（如果不存在的话）
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 9:44
 */
public class FlyWeightFactory {

    private Map<String,FlyWeight> flyWeightMap = new HashMap<>();

    //初始化工厂时，先生成三个实例
    public FlyWeightFactory(){
        flyWeightMap.put("X",new ConcreteFlyWeight());
        flyWeightMap.put("Y",new ConcreteFlyWeight());
        flyWeightMap.put("Z",new ConcreteFlyWeight());
    }

    //根据客户端请求，获得已生成的实例
    public FlyWeight getFlyWeight(String key){
        FlyWeight flyWeight = flyWeightMap.get(key);
        return flyWeight;
    }

}
